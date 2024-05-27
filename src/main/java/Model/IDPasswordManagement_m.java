package Model;

import View.IDPasswordManagement;

import javax.swing.*;

public class IDPasswordManagement_m {
    private IDPasswordManagement idPasswordManagement;

    public IDPasswordManagement_m(IDPasswordManagement idPasswordManagement){
        this.idPasswordManagement=idPasswordManagement;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.idPasswordManagement);
        welcome.repaint();
        welcome.revalidate();
    }
}
