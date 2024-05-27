package Model;

import View.Home;

import javax.swing.*;

public class Home_m {
    Home home = new Home();

    public Home_m(Home home) {
        this.home = home;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.home);
        welcome.repaint();
        welcome.revalidate();
    }
}
