package Model;

import View.SetGoal;
import View.Tutorial;

import javax.swing.*;
import java.util.List;
import Class.User;
public class SetGoal_m {
    private SetGoal setGoal;

    public SetGoal_m(SetGoal setGoal){
        this.setGoal=setGoal;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.setGoal);
        welcome.repaint();
        welcome.revalidate();
    }
    public User confirmButton(User user){
        int value = Integer.parseInt(setGoal.getTextField1().getText());

        user.setProgress(value);

        return user;
    }
}
