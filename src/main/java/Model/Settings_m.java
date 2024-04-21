package Model;

import View.Settings;

import javax.swing.*;

public class Settings_m {
    private Settings settings;

    public Settings_m(Settings settings){
        this.settings=settings;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.settings);
        welcome.repaint();
        welcome.revalidate();
    }
}
