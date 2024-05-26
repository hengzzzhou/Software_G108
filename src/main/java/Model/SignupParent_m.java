package Model;

import View.SignupParent;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.io.*;

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
        jsonObject = new JSONObject();
        jsonObject.put("ID",this.signupParent.getTextField1().getText());
        JSONArray jsonArray = new JSONArray();
        jsonObject.put("Tasks",jsonArray);
        try{
            FileWriter fileWriter=new FileWriter("src/main/java/Class/TaskList.jsonl",true);
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

    public boolean checkID(){
        if(this.signupParent.getTextField1().getText()==null){
            return false;
        }else{
            String id=this.signupParent.getTextField1().getText();
            File file =new File("src/main/java/Class/ParentAccounts.jsonl");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line = null;
                while((line=reader.readLine())!=null){
                    JSONObject jsonObject= new JSONObject(line);
                    if(id.equals(jsonObject.get("ID"))){
                        return false;
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            return true;
        }
    }

    // This method checks if the password is the same in both fields
    public boolean checkPassword(){
        if(this.signupParent.getPasswordField1().getPassword()==null||this.signupParent.getPasswordField2().getPassword()==null){
            return false;
        }else{
            String password1=new String(this.signupParent.getPasswordField1().getPassword());
            String password2=new String(this.signupParent.getPasswordField2().getPassword());

            if(!password1.equals(password2)){
                return false;
            }else{
                return true;
            }
        }
    }
}
