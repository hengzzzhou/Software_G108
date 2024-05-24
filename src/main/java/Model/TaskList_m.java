package Model;

import View.AddTask;
import View.TaskItem;
import View.TaskList;

import javax.swing.*;
import Class.Task;
import View.Welcome;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class TaskList_m {
    private TaskList taskList;
    private ArrayList<Task> tasksOrigin;
    private ArrayList<TaskItem> tasks;
    private ArrayList<TaskItem_m> taskms;
    private AddTask addTask;
    private AddTask_m addTask_m;
    private JFrame frame;

    public TaskList_m(TaskList taskList, JFrame frame) {
        this.taskList = taskList;
        this.tasks = new ArrayList<TaskItem>();
        this.taskms = new ArrayList<TaskItem_m>();
        this.addTask = new AddTask();
        this.addTask_m = new AddTask_m(this.addTask);
        this.frame = frame;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.taskList);
        welcome.repaint();
        welcome.revalidate();
    }
    public void clearPanel(){
        this.taskList.getListPanel().removeAll();
    }

    public void setTasks(ArrayList<Task> tasks){
        this.tasks.clear();
        this.taskms.clear();
        this.tasksOrigin = tasks;
        for(Task task: tasks){
            TaskItem taskItem = new TaskItem();
            TaskItem_m taskItem_m = new TaskItem_m(taskItem, task.getId(), task);
            taskItem.getNameLabel().setText(task.getName());
            taskItem.getStatusLabel().setText(task.getStatus());
            if(task.getStatus().equals("Checking")){
                taskItem.getButton3().setVisible(true);
                taskItem.getButton3().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        taskItem.getButton3().setVisible(false);
                        taskItem.getStatusLabel().setText("Completed");
                        task.setStatus("Completed");
                    }
                });
            }
            taskItem.getDelButton().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    delmouseClicked(e);
                }
            });
            taskItem.getCheckButton().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    checkmouseClicked(e);
                }
            });
            this.tasks.add(taskItem);
            this.taskms.add(taskItem_m);
        }
    }

    private void checkmouseClicked(MouseEvent e) {
        this.addTask_m.init(this.frame);
        TaskItem_m source = null;

        for(TaskItem_m taskm: this.taskms){
            if(taskm.getTaskItem().getCheckButton() == e.getSource()){
                source = taskm;

            }
        }
        Task task = source.getTask();
        this.addTask.getItemField().setText(task.getName());
        this.addTask.getRewardField().setText(String.valueOf(task.getReward()));
        this.addTask.getPriorityField().setText(String.valueOf(task.getPriority()));
        this.addTask.getDescriptionField().setText(task.getDescription());
        this.addTask.getDateField().setText(task.getDate());

    }

    private void delmouseClicked(MouseEvent e) {
        JButton source = (JButton) e.getSource();
        TaskItem sourceTask = null;
        for (TaskItem taskItem: this.tasks){
            if(taskItem.getDelButton() == source){
                sourceTask = taskItem;
                break;
            }
        }
        for(TaskItem task: this.tasks){
            if(task == sourceTask){
                this.tasks.remove(task);
                break;
            }
        }
        String id = "";
        for (TaskItem_m taskm: this.taskms){
            if(taskm.getTaskItem() == sourceTask){
                id = taskm.getId();
                this.taskms.remove(taskm);
                break;
            }
        }
        for (Task task: this.tasksOrigin){
            if(task.getId().equals(id)){
                this.tasksOrigin.remove(task);
                break;
            }
        }
        this.taskList.getListPanel().remove(sourceTask);
        this.taskList.getListPanel().repaint();
        this.taskList.getListPanel().revalidate();
    }

    public void showTasks(ArrayList<Task> tasks){
        this.clearPanel();
        this.setTasks(tasks);
        for(TaskItem task: this.tasks){
            taskList.getListPanel().add(task);
        }
    }

    public AddTask getAddTask() {
        return addTask;
    }
}
