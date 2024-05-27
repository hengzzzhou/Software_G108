package Model;

import View.SetGoal;
import View.Tutorial;

import javax.swing.*;
import java.util.List;
import Class.*;


import View.SetGoal;
import javax.swing.*;

public class SetGoal_m {
    private SetGoal setGoal;

    public SetGoal_m(SetGoal setGoal){
        this.setGoal = setGoal;
    }

    public void init(JFrame parentFrame) {
        JDialog dialog = new JDialog(parentFrame, "Set Goal", true);
        dialog.getContentPane().add(this.setGoal);
        dialog.pack();
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
    }

    public Child confirmButton(Child user) {
        if(!checkInput()){
            return user;
        }
        int value = Integer.parseInt(setGoal.getTextField1().getText());
        if(checkValidGoal(user, value)){
            user.setProgress(value);
        }
        return user;
    }

    public boolean checkValidGoal(User user, int value){
        boolean flag = true;
        if(value<=0){
            flag = false;
            JOptionPane.showMessageDialog(null, "Please set a valid goal! You may not set a goal of 0 or less.");
        }else if(value<=user.getTotal()){
            flag = false;
            JOptionPane.showMessageDialog(null, "You have already reached your goal!");
        }
        return flag;
    }
    public boolean checkInput(){
        if(setGoal.getTextField1().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            return false;
        }
        if(setGoal.getTextField1().getText().matches("[0-9]+") == false){
            JOptionPane.showMessageDialog(null, "Please enter a number!");
            return false;
        }
        return true;
    }
}

