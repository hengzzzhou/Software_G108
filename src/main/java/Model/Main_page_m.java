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

        // 此处设置账号的总资产
        main_page.getTotalAssets().setText("$"+user.getTotal());
        main_page.getGoalButton().setText("My Goal: "+ user.getProgress());
        welcome.getContentPane().add(this.main_page);
        welcome.repaint();
        welcome.revalidate();
        this.setProgressBarValue(user,user.getProgress());
    }

    public void setProgressBarValue(User user,int value) {
        double now = user.getTotal();

        this.main_page.getProgressBar1().setValue((int)(now/value*100));

    }


}
