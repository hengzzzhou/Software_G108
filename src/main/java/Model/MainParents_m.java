package Model;

import View.MainParents;

import javax.swing.*;

public class MainParents_m {
    private MainParents mainParents;

    public MainParents_m(MainParents mainParents) {
        this.mainParents = mainParents;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.mainParents);
        welcome.repaint();
        welcome.revalidate();
    }
}
