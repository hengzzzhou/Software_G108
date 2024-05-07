package Model;

import View.Task;

import javax.swing.*;

public class Task_m {

    private Task task;

    public Task_m(Task task) {
        this.task = task;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.task);
        welcome.repaint();
        welcome.revalidate();
    }
}
