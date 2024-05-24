package Class;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parent extends User{

    public Parent(){
        super();
    }
    public Parent(String ID){
        super(ID);
    }
    public Parent(String ID, String password)throws IOException, JSONException {
        File fileAccount=new File("src/main/java/Class/ParentAccounts.jsonl");
        JSONObject matchedUsers = findUsersByUserName(fileAccount, ID);

        if(matchedUsers != null) {
            if (Objects.equals(matchedUsers.getString("Password"), password)) {
                this.ID = ID;
                // 以下内容初始化有关账户的信息
                this.logList = new ArrayList<>();
                this.tasks = new ArrayList<>();
            } else {
                this.flag = 0;
            }
        }
    }

    public void dumpTaskList(){
        // search for the parent's task list and modify it
        File file = new File("src/main/java/Class/TaskList.jsonl");
        File tempFile = new File("src/main/java/Class/TaskList_temp.jsonl");
        String line;
        List<String> lines = new ArrayList<>();
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // 读取所有条目到列表中
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (int i = 0; i < lines.size(); i++){
                JSONObject jsonObject = new JSONObject(lines.get(i));
                /*** 该处需要在jsonl修改时进行修改 ***/
                if (jsonObject.getString("ID").equals(this.getID())) {
                    found = true;
                    jsonObject.put("ID", this.getID());
                    JSONArray jsonArray = new JSONArray();
                    for(Task task: this.getTasks()){
                        JSONObject taskItem = new JSONObject();
                        taskItem.put("taskID", task.getId());
                        taskItem.put("taskName", task.getName());
                        taskItem.put("taskReward", task.getReward());
                        taskItem.put("taskPriority", task.getPriority());
                        taskItem.put("taskDescription", task.getDescription());
                        taskItem.put("taskDate", task.getDate());
                        taskItem.put("taskStatus", task.getStatus());
                        jsonArray.put(taskItem);
                    }
                    jsonObject.put("Tasks", jsonArray);
                    // 保存信息
                    lines.set(i, jsonObject.toString());
                }
            }
            if (found == false){
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("ID", this.getID());
                JSONArray jsonArray = new JSONArray();
                for(Task task: this.getTasks()){
                    JSONObject taskItem = new JSONObject();
                    taskItem.put("taskID", task.getId());
                    taskItem.put("taskName", task.getName());
                    taskItem.put("taskReward", task.getReward());
                    taskItem.put("taskPriority", task.getPriority());
                    taskItem.put("taskDescription", task.getDescription());
                    taskItem.put("taskDate", task.getDate());
                    taskItem.put("taskStatus", task.getStatus());
                    jsonArray.put(taskItem);
                }
                jsonObject.put("Tasks", jsonArray);
                // 保存信息
                lines.add(jsonObject.toString());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        // 写入新文件并执行替换
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            for (String jsonLine : lines) {
                writer.write(jsonLine);
                writer.newLine();
            }
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        file.delete();
        tempFile.renameTo(file);
    }
}
