package Model;

import View.Target;
import javax.swing.*;

public class Target_m {
    private Target target;

    public Target_m(Target target){
        this.target=target;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.target);
        welcome.repaint();
        welcome.revalidate();
    }
}
