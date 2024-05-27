package Model;

import View.WelDial;

import javax.swing.*;

public class WelDial_m {
    private WelDial welDial;

    public WelDial_m(WelDial welDial){
        this.welDial=welDial;
    }

    public void init(){
        this.welDial.setSize(400,200);
        this.welDial.setLocationRelativeTo(null);
        this.welDial.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.welDial.setVisible(true);
    }

    public void changeVal(String message){
        this.welDial.getLabel1().setText(message);
    }
}
