package Model;

import View.TaskItem;
import View.TaskItemChild;

import javax.swing.*;
import Class.Task;

public class TaskItemChild_m {
    private TaskItemChild taskItemChild;

    private Task task;
    private String id;

    public TaskItemChild_m(TaskItemChild taskItemChild, String id, Task task) {
        this.taskItemChild = taskItemChild;
        this.id = id;
        this.task = task;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.taskItemChild);
        welcome.repaint();
        welcome.revalidate();
    }
    public TaskItemChild getTaskItemChild(){
        return taskItemChild;
    }
    public String getId(){
        return id;
    }
    public Task getTask(){
        return task;
    }
}
