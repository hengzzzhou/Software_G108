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
        int value = Integer.parseInt(setGoal.getTextField1().getText());
        user.setProgress(value);
        return user;
    }
}

