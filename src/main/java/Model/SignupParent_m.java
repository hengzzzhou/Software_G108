package Model;

import View.SignupParent;
import org.json.JSONObject;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SignupParent_m {
    private SignupParent signupParent;

    public SignupParent_m(SignupParent signupParent) {
        this.signupParent = signupParent;
    }
    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.signupParent);
        welcome.repaint();
        welcome.revalidate();
    }
    public void registerParent(){
        JSONObject jsonObject=new JSONObject();

        // 初始化基本信息
        jsonObject.put("ID",this.signupParent.getTextField1().getText());
        jsonObject.put("Password",new String (this.signupParent.getPasswordField1().getPassword()));

        try{
            FileWriter fileWriter=new FileWriter("src/main/java/Class/ParentAccounts.jsonl",true);
            PrintWriter out=new PrintWriter(fileWriter);
            out.write(jsonObject.toString()+"\n");
            fileWriter.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        this.clear();
    }
    public void clear(){
        this.signupParent.getTextField1().setText("");
        this.signupParent.getPasswordField1().setText("");
        this.signupParent.getPasswordField2().setText("");
    }
}
