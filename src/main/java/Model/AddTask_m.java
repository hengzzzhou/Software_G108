package Model;

import View.AddTask;
import Class.Task;
import javax.swing.*;

public class AddTask_m {
    AddTask addTask = new AddTask();

    public AddTask_m(AddTask addTask) {
        this.addTask = addTask;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.addTask);
        welcome.repaint();
        welcome.revalidate();
    }

    public void clearFields(){
        addTask.getItemField().setText("");
        addTask.getRewardField().setText("");
        addTask.getPriorityField().setText("");
        addTask.getDescriptionField().setText("");
        addTask.getDateField().setText("");
    }

    //while return button is clicked, object task will be passed to the user
    public Task setTask(String id){
        String name = addTask.getItemField().getText();
        int reward = Integer.parseInt(addTask.getRewardField().getText());
        int priority = Integer.parseInt(addTask.getPriorityField().getText());
        String description = addTask.getDescriptionField().getText();
        String date = addTask.getDateField().getText();
        Task task = new Task(id, name, reward, priority, description, date, "Incomplete");
        return task;
    }
}
