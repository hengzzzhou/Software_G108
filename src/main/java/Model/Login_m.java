package Model;

import View.Login;
import org.json.JSONObject;
import Class.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Login_m {
    private Login login;

    public Login_m(Login login){
        this.login=login;
    }

    // This method checks if the ID and password are correct
    public User check() throws IOException {

        User user_account = new User();
        if(this.login.getTextField1().getText()!=null && this.login.getPasswordField1().getPassword()!=null){
            String id=this.login.getTextField1().getText();
            char[] password=this.login.getPasswordField1().getPassword();
            String pass = String.valueOf(password);
            user_account = new User(id, pass);
        }
        return user_account;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.login);
        welcome.repaint();
        welcome.revalidate();
    }
}
