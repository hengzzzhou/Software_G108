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
    private String username;
    private String email;
    private String passwordHash;
    private String task_list;

    private List<Task> tasks;

    // 构造方法，用于从JSONObject初始化User对象
    public User(String username, String password) throws JSONException, IOException {

        File file=new File("src/main/java/Accounts.jsonl");
        JSONObject matchedUsers = findUsersByUserName(file, username);

        if(matchedUsers != null){
            if(Objects.equals(matchedUsers.getString("passwordHash"), password)){
                this.username = username;
                this.email = matchedUsers.getString("email");
                this.task_list = matchedUsers.getString("task_list");
                this.tasks = initializeTasksFromFile();
            }
        }
    }

    // getter 和 setter 方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTask() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    // 获取jsonl中具体某一条内容的值
    // 查找jsonl文件中指定username的用户信息
    public static JSONObject findUsersByUserName(File jsonlFile, String targetUsername) throws IOException {
        JSONObject matchedUsers;
        try (BufferedReader reader = new BufferedReader(new FileReader(jsonlFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                JSONObject jsonObject = new JSONObject(line);
                if (jsonObject.getString("username").equals(targetUsername)) {
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
}

