package Model;

import View.Login;
import org.json.JSONObject;

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
    public boolean check(){
        String id=this.login.getTextField1().getText();
        String password=new String(this.login.getPasswordField1().getPassword());
        File file =new File("src/main/java/Accounts.jsonl");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line =null;
            while((line=reader.readLine())!=null){
                JSONObject jsonObject= new JSONObject(line);
                if(id.equals(jsonObject.get("ID"))&&password.equals(jsonObject.get("Password"))){
                    return true;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.login);
        welcome.repaint();
        welcome.revalidate();
    }
}
