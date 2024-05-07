package Class;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.JSONObject;

public class User {
    // 定义User类的属性
    private String ID;
    private String email;
    private String password;
    private String task_list;
    private int progress;
    private List<Task> tasks;

    /******** 用于user类初始化时检测密码是否正确（后可用于校验登录账户） ********/
    public int flag;


    /******* 构造方法，用于从JSONObject初始化User对象(第一个方法用于初始化) *******/
    public User(){
        this.flag = 0;
    }
    public User(String ID, String password) throws JSONException, IOException {

        File file=new File("src/main/java/Accounts.jsonl");
        JSONObject matchedUsers = findUsersByUserName(file, ID);

        if(matchedUsers != null){
            if(Objects.equals(matchedUsers.getString("Password"), password)){
                this.ID = ID;
                this.email = matchedUsers.getString("email");
                this.task_list = matchedUsers.getString("task_list");
                this.tasks = initializeTasksFromFile();
                this.progress=18;
                this.flag = 1;
            }else {
                this.flag = 0;
            }
        }
    }

    // getter 和 setter 方法
    public String getID() {
        return ID;
    }

    public void setID(String username) {
        this.ID = username;
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

    public List<Task> initializeTasksFromFile() {
        Map<String, Task> taskMap = new HashMap<>();
        File file=new File("src/main/java/Task.jsonl");
        List<Task> my_task = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                JSONObject taskJson = new JSONObject(line);
                String fin = "0";
                if(Objects.equals(taskJson.getString("fin"), fin)){
                    Task tmp = new Task(taskJson.getString("task_ID"), taskJson.getString("target"), taskJson.getString("date"));
                    my_task.add(tmp);
                }
            }
            // 将map中的所有Task对象添加到tasks列表中（这里假设你想把所有的Task都添加进去）

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return my_task;
    }

    public int getProgress() {
        return progress;
    }
}

