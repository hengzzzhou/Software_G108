package Model;

import View.Main_page;

import javax.swing.*;
import Class.User;

public class Main_page_m {
    private Main_page main_page;

    public Main_page_m(Main_page main_page){
        this.main_page=main_page;
    }

    public void init(JFrame welcome, User user){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.main_page);
        welcome.repaint();
        welcome.revalidate();
        this.setProgressBarValue(user.getProgress());
    }

    public void setProgressBarValue(int value) {
        this.main_page.getProgressBar1().setValue(value);
    }
}
