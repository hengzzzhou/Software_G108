package Model;

import View.TaskItem;
import Class.Task;

public class TaskItem_m {
    private TaskItem taskItem;
    private Task task;
    private String id;

    public TaskItem_m(TaskItem taskItem, String id, Task task) {
        this.taskItem = taskItem;
        this.id = id;
        this.task = task;
    }

    public TaskItem getTaskItem(Task task){
        this.task = task;
        taskItem.getNameLabel().setText(task.getName());
        taskItem.getStatusLabel().setText(task.getStatus());
        return taskItem;
    }
    public TaskItem getTaskItem(){
        return taskItem;
    }
    public String getId(){
        return id;
    }
    public Task getTask(){
        return task;
    }
}
