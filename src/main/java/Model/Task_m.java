package Model;

import View.TaskView;

import javax.swing.*;

public class Task_m {

    private TaskView task;

    public Task_m(TaskView task) {
        this.task = task;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.task);
        welcome.repaint();
        welcome.revalidate();
    }
}
