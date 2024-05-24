package Class;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
    private String  id;

    private String name;
    private int reward;
    private int priority;
    private String description;
    private String date;
    private String status;

    public Task(String id, String name, int reward, int priority, String description, String date, String status) {
        this.id = id;
        this.name = name;
        this.reward = reward;
        this.priority = priority;
        this.description = description;
        this.date = date;
        this.status = status;
    }
//    public Task(String name, int reward, int priority, String description, String date, String status) {
//        this.name = name;
//        this.reward = reward;
//        this.priority = priority;
//        this.description = description;
//        this.date = date;
//        this.status = status;
//        this.id = "None";
//    }

    // getters and setters...

    public String setId() {
        //read json and get a non-conflict id
        return "0";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
    public String getId() {
        return id;
    }
    public int getReward() {
        return reward;
    }
    public int getPriority() {
        return priority;
    }
    public String getDescription() {
        return description;
    }
    public String getDate() {
        return date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}