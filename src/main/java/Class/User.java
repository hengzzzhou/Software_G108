package Class;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class User {
    // 定义User类的属性
    protected String ID;
    private String email;
    protected String password;
    protected String task_list;
    private int progress;
    protected ArrayList<Task> tasks;
    private String currentTime;

    /******** 以下内容为三个账户有关信息 ********/
    protected double charge;
    private double timeDeposit;
    private double demandDeposit;
    private double timeRate;
    private double total;
    private String depositTime;
    private int timeLeft;

    /******** 以下内容为log有关信息 ********/
    protected List<String> logList;  // list的每一项为(日期|事项|金额)，初始化可对txt文件进行按行读取，此处未实现

    /******** 用于user类初始化时检测密码是否正确（后可用于校验登录账户） ********/
    public int flag;

    /******* 构造方法，用于从JSONObject初始化User对象(第一个方法用于初始化) *******/
    public User(){
        this.flag = 0;
        this.tasks = new ArrayList<>();
    }
    public User(String ID){
        this.ID = ID;
        this.flag = 0;
        this.tasks = new ArrayList<>();
    }

    public User(String ID, String password) throws JSONException, IOException {

        File file = new File("src/main/java/Class/Accounts.jsonl");
        JSONObject matchedUsers = findUsersByUserName(file, ID);

        if (matchedUsers != null) {
            if (Objects.equals(matchedUsers.getString("Password"), password)) {
                this.ID = ID;
                this.email = matchedUsers.getString("email");
                this.task_list = matchedUsers.getString("task_list");
                this.tasks = null;
                this.progress = readProgressFromFile(); // 读取进度
                this.flag = 1;

                // 以下内容初始化有关账户的信息
                this.logList = loadLogListFromFile();
                this.charge = matchedUsers.getDouble("charge");
                this.depositTime = matchedUsers.getString("depositTime");
                this.timeDeposit = matchedUsers.getDouble("timeDeposit");
                this.timeRate = matchedUsers.getDouble("timeRate");
                this.timeLeft = matchedUsers.getInt("timeLeft");
                this.update_timeAndDeposit();
                this.demandDeposit = matchedUsers.getDouble("demandDeposit");
                this.total = this.charge + this.timeDeposit + this.demandDeposit;
            } else {
                this.flag = 0;
            }
        }
    }

    // getter 和 setter 方法

    // 以下部分为三个账号的get与set方法
    public double getTotal() {
        this.total = charge + timeDeposit + demandDeposit;
        return total;
    }
    public double getCharge() {
        return charge;
    }
    public void setCharge(double charge){
        this.charge = charge;
        this.total = charge + timeDeposit + demandDeposit;
    }
    public double getTimeDeposit() {
        return timeDeposit;
    }
    public void setTimeDeposit(double timeDeposit){
        this.timeDeposit = timeDeposit;
        this.total = charge + timeDeposit + demandDeposit;
    }
    public double getDemandDeposit() {
        return demandDeposit;
    }
    public void setDemandDeposit(double demandDeposit){
        this.demandDeposit = demandDeposit;
        this.total = charge + timeDeposit + demandDeposit;
    }
    public String getDepositTime() {
        return depositTime;
    }
    public void setDepositTime(String depositTime) {
        this.depositTime = depositTime;
    }

    // 以下为有关log操作的方法 (可添加按条目删减等方法)
    public List<String> getLogList() {
        return logList;
    }
    public void setLogList(List<String> logList){
        this.logList = logList;
        saveLogListToFile(logList);

    }

    protected void saveLogListToFile(List<String> logList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/Class/LOG_FILE"))) {
            for (String log : logList) {
                writer.write(log);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected List<String> loadLogListFromFile() {
        List<String> logList = new ArrayList<>();
        File file = new File("src/main/java/Class/LOG_FILE");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    logList.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return logList;
    }

    // 以下为一些基础操作
    public String getID() {
        return ID;
    }
    public void setID(String username) {
        this.ID = username;
    }

    public int getTimeLeft() { return timeLeft; }
    public void setTimeLeft(int timeLeft) { this.timeLeft = timeLeft; }

    public Double getTimeRate() {
        return timeRate;
    }
    public void setTimeRate(Double timeRate) {
        this.timeRate = timeRate;
    }

    public String getTask_list() {
        return task_list;
    }
    public void setTask_list(String task_list) {
        this.task_list = task_list;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwordHash) {
        this.password = passwordHash;
    }

    private void update_timeAndDeposit(){
        // 读取上次日期为数值
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate date = LocalDate.parse(this.depositTime, formatter);
        int year_pas = date.getYear();
        int month_pas = date.getMonthValue();

        // 获取系统当前日期
        Calendar cal = Calendar.getInstance();
        int year_cur = cal.get(Calendar.YEAR);
        int month_cur = cal.get(Calendar.MONTH) + 1; // Calendar.MONTH是从0开始的

        // 计算更新后的定期与活期存款 (可进一步完善逻辑)
        int period = 0;
        int flag = 0;
        if (year_cur == year_pas){
            period = month_cur - month_pas;
        } else {
            period = month_cur - month_pas + 12 * (year_cur - year_pas);
        }

        if (period < timeLeft){
            timeLeft -= period;
        }else{
            timeLeft = 0;
            period = timeLeft;
            flag = 1;
        }

        this.timeDeposit = this.timeDeposit + this.timeDeposit * period * this.timeRate;
        double demandRate = 0.02;
        this.demandDeposit = this.demandDeposit + this.demandDeposit * period * demandRate;

        if (flag == 1){
            this.charge += this.timeDeposit;
            this.timeDeposit = 0;
        }

        // 格式化信息为所需字符串，设置当前日期
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.currentTime = dateFormat.format(cal.getTime());
    }

    // 获取jsonl中具体某一条内容的值
    // 查找jsonl文件中指定username的用户信息
    public static JSONObject findUsersByUserName(File jsonlFile, String targetUsername) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(jsonlFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                JSONObject jsonObject = new JSONObject(line);
                if (jsonObject.getString("ID").equals(targetUsername)) {
                    return jsonObject;
                }
            }
            return null;
        }
    }


    public int getProgress() {
        return progress;
    }
    public void addTask(Task task){
        this.tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void loadTaskList(){
        File file=new File("src/main/java/Class/TaskList.jsonl");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                JSONObject taskJson = new JSONObject(line);
                if(taskJson.getString("ID").equals(this.ID)){
                    JSONArray jsonArray = taskJson.getJSONArray("Tasks");
                    for(int i = 0; i < taskJson.getJSONArray("Tasks").length(); i++){
                        JSONObject taskJsonItem = jsonArray.getJSONObject(i);
                        Task tmp = new Task(taskJsonItem.getString("taskID"), taskJsonItem.getString("taskName"), taskJsonItem.getInt("taskReward"), taskJsonItem.getInt("taskPriority"), taskJsonItem.getString("taskDescription"), taskJsonItem.getString("taskDate"), taskJsonItem.getString("taskStatus"));
                        this.tasks.add(tmp);
                    }
                    break;
                }else{
                    this.tasks = new ArrayList<>();
                }
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }


    public void setProgress(int progress) {
        this.progress = progress;
        saveProgressToFile(progress); // 保存进度
    }

    // 读取进度
    private int readProgressFromFile() {
        File file = new File("src/main/java/Class/progress.txt");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line = reader.readLine();
                if (line != null) {
                    return Integer.parseInt(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 0; // 默认进度为0
    }

    // 保存进度
    private void saveProgressToFile(int progress) {
        File file = new File("src/main/java/Class/progress.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(String.valueOf(progress));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
