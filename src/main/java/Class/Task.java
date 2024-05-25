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

    /**
     * Constructor
     * @param name task name
     * @param reward task reward
     * @param priority task priority
     * @param description task description
     * @param date task date
     * @param status task status
     */
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
    /**
     * Set the task id
     * @return the task id
     */
    public String setId() {
        //read json and get a non-conflict id
        return "0";
    }

    /**
     * Get the task name
     * @return the task name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the task status
     * @return the task status
     */
    public String getStatus() {
        return status;
    }
    /**
     * Get the task id
     * @return the task id
     */
    public String getId() {
        return id;
    }
    /**
     * Get the task reward
     * @return the task reward
     */
    public int getReward() {
        return reward;
    }
    /**
     * Get the task priority
     * @return the task priority
     */
    public int getPriority() {
        return priority;
    }
    /**
     * Get the task description
     * @return the task description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Get the task date
     * @return the task date
     */
    public String getDate() {
        return date;
    }
    /**
     * Set the task status
     * @param status the task status
     */
    public void setStatus(String status) {
        this.status = status;
    }

}