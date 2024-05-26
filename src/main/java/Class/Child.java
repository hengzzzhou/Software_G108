package Class;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Child extends User{
    private String parentID;

    public Child(){
        super();
    }

    public Child(String ID, String password)throws IOException, JSONException {
        super(ID, password);
        JSONObject jobj = User.findUsersByUserName(new File("src/main/java/Class/Accounts.jsonl"), ID);
        this.parentID = jobj.getString("parentID");
        //this.tasks = initializeTasksFromFile();
    }
    public Child(String ID, String password, String parentID)throws Exception{
        super(ID, password);
        this.parentID = parentID;
        this.tasks = initializeTasksFromFile();
    }


    public String getParentID() {
        return this.parentID;
    }
    public ArrayList<Task> initializeTasksFromFile() {
        Map<String, Task> taskMap = new HashMap<>();
        File file=new File("src/main/java/Class/TaskList.jsonl");
        ArrayList<Task> my_task = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                JSONObject taskJson = new JSONObject(line);
                if(taskJson.getString("ID").equals(this.parentID)){
                    JSONArray jsonArray = taskJson.getJSONArray("Tasks");
                    for(int i = 0; i < taskJson.getJSONArray("Tasks").length(); i++){
                        JSONObject taskJsonItem = jsonArray.getJSONObject(i);
                        Task tmp = new Task(taskJsonItem.getString("taskID"), taskJsonItem.getString("taskName"), taskJsonItem.getInt("taskReward"), taskJsonItem.getInt("taskPriority"), taskJsonItem.getString("taskDescription"), taskJsonItem.getString("taskDate"), taskJsonItem.getString("taskStatus"));
                        my_task.add(tmp);
                        System.out.println(tmp.getName());
                    }
                }

            }
            // 将map中的所有Task对象添加到tasks列表中（这里假设你想把所有的Task都添加进去）

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return my_task;
    }
    public void loadTaskList(){
        this.tasks = new ArrayList<>();
        File file=new File("src/main/java/Class/TaskList.jsonl");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                JSONObject taskJson = new JSONObject(line);
                if(taskJson.getString("ID").equals(this.parentID)){
                    JSONArray jsonArray = taskJson.getJSONArray("Tasks");
                    for(int i = 0; i < taskJson.getJSONArray("Tasks").length(); i++){
                        JSONObject taskJsonItem = jsonArray.getJSONObject(i);
                        if (taskJsonItem.getString("taskStatus").equals("Completed")){
                            this.charge+=taskJsonItem.getInt("taskReward");
                            continue;
                        }
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
                if (jsonObject.getString("ID").equals(this.parentID)) {
                    found = true;
                    jsonObject.put("ID", this.parentID);
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
            if (!found){
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
    public String getID() {
        return this.ID;
    }
}
