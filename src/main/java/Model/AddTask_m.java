package Model;

import View.AddTask;
import Class.Task;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    /**
     * Set the task
     * @param id
     * @return
     */
    public Task setTask(String id){
        if(checkValidTask()){
            String name = addTask.getItemField().getText();
            int reward = Integer.parseInt(addTask.getRewardField().getText());
            int priority = Integer.parseInt(addTask.getPriorityField().getText());
            String description = addTask.getDescriptionField().getText();
            String date = addTask.getDateField().getText();
            Task task = new Task(id, name, reward, priority, description, date, "Incomplete");
            return task;
        }
        return null;
    }

    /**
     * Check if the task is valid
     * @return
     */
    public boolean checkValidTask(){
        if(addTask.getItemField().getText().equals("") || addTask.getRewardField().getText().equals("") || addTask.getPriorityField().getText().equals("") || addTask.getDescriptionField().getText().equals("") || addTask.getDateField().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill in all fields!");
            return false;
        }
        if(!addTask.getDateField().getText().matches("\\d{4}-\\d{2}-\\d{2}")){
            JOptionPane.showMessageDialog(null, "Please enter a valid date format! (yyyy-mm-dd)");
            return false;
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = df.format(new Date());
        currentTime = currentTime.substring(0, 10);
        if(addTask.getDateField().getText().compareTo(currentTime) < 0){
            JOptionPane.showMessageDialog(null, "Please enter a valid date! You may not set a task in the past!");
            return false;
        }
        if(!addTask.getRewardField().getText().matches("\\d+") || !addTask.getPriorityField().getText().matches("\\d+")){
            JOptionPane.showMessageDialog(null, "Please enter a number for Reward and Priority and it cannot be negative!");
            return false;
        }
        if(Integer.parseInt(addTask.getRewardField().getText()) < 0 || Integer.parseInt(addTask.getPriorityField().getText()) <= 0){
            JOptionPane.showMessageDialog(null, "Please enter a valid number for Reward and Priority! They should be greater than 0!");
            return false;
        }
        return true;
    }
}
