package Model;

import View.Tutorial;

import javax.swing.*;

public class Tutorial_m {
    private Tutorial tutorial;

    public Tutorial_m(Tutorial tutorial){
        this.tutorial=tutorial;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.tutorial);
        welcome.repaint();
        welcome.revalidate();
    }
}

