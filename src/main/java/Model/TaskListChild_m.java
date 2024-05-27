package Model;

import View.AddTask;
import View.TaskItem;
import View.TaskItemChild;
import View.TaskListChild;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import Class.Task;

public class TaskListChild_m {
    private TaskListChild taskListChild;
    private ArrayList<Task> tasksOrigin;
    private ArrayList<TaskItemChild> tasks;
    private ArrayList<TaskItemChild_m> taskms;
    private AddTask addTask;
    private AddTask_m addTask_m;
    private JFrame frame;

    public TaskListChild_m(TaskListChild taskListChild, JFrame frame) {

        this.tasks = new ArrayList<TaskItemChild>();
        this.taskms = new ArrayList<TaskItemChild_m>();
        this.taskListChild = taskListChild;
        this.addTask = new AddTask();
        this.addTask_m = new AddTask_m(this.addTask);
        this.frame = frame;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.taskListChild);
        welcome.repaint();
        welcome.revalidate();
    }
    public void setTasks(ArrayList<Task> tasks){
        this.tasks.clear();
        this.taskms.clear();
        this.tasksOrigin = tasks;
        for(Task task: tasks){
            TaskItemChild taskItemChild = new TaskItemChild();
            TaskItemChild_m taskItemChild_m = new TaskItemChild_m(taskItemChild, task.getId(), task);
            taskItemChild.getNameLabel().setText(task.getName());
            taskItemChild.getStatusLabel().setText(task.getStatus());
            taskItemChild.getDoneButton().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    donemouseClicked(e);
                }
            });
            taskItemChild.getCheckButton().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    checkmouseClicked(e);
                }
            });
            this.tasks.add(taskItemChild);
            this.taskms.add(taskItemChild_m);
        }

    }
    public void clearPanel(){
        this.taskListChild.getListPanel().removeAll();
    }
    public void showTasks(ArrayList<Task> tasks){
        this.clearPanel();
        this.setTasks(tasks);
        for(TaskItemChild task: this.tasks){
            taskListChild.getListPanel().add(task);
        }
    }
    private void checkmouseClicked(MouseEvent e) {
        this.addTask_m.init(this.frame);
        TaskItemChild_m source = null;

        for(TaskItemChild_m taskm: this.taskms){
            if(taskm.getTaskItemChild().getCheckButton() == e.getSource()){
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
    private void donemouseClicked(MouseEvent e) {
        JButton source = (JButton) e.getSource();
        TaskItemChild sourceTask = null;
        for (TaskItemChild taskItem: this.tasks){
            if(taskItem.getDoneButton() == source){
                sourceTask = taskItem;

                break;
            }
        }
        String id = "";
        for (TaskItemChild_m taskm: this.taskms){
            if(taskm.getTaskItemChild() == sourceTask){
                id = taskm.getId();
                break;
            }
        }
        for (Task task: this.tasksOrigin){
            if(task.getId().equals(id) && !task.getStatus().equals("Completed")){
                task.setStatus("Checking");
                sourceTask.getStatusLabel().setText("Checking");
                System.out.println("Task " + task.getName() + " is done");
                break;
            }
        }
        this.taskListChild.getListPanel().repaint();
        this.taskListChild.getListPanel().revalidate();
    }

    public AddTask getAddTask() {
        return addTask;
    }
}
