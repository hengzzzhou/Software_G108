package Model;

import View.Signup;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Class.*;

public class Signup_m {

    private Signup signup;
    private File file=new File("src/main/java/Class/Accounts.jsonl");

    public Signup_m(Signup signup){
        this.signup=signup;
    }

    // This method checks if the ID is already taken
    public boolean checkID(){
        if(this.signup.getTextField1().getText()==null){
            return false;
        }else{
            String id=this.signup.getTextField1().getText();
            File file =new File("src/main/java/Class/Accounts.jsonl");
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
        if(this.signup.getPasswordField1().getPassword()==null||this.signup.getPasswordField2().getPassword()==null){
            return false;
        }else{
            String password1=new String(this.signup.getPasswordField1().getPassword());
            String password2=new String(this.signup.getPasswordField2().getPassword());

            if(!password1.equals(password2)){
                return false;
            }else{
                return true;
            }
        }
    }

    public boolean checkParentID(){
        if(this.signup.getParentID().getText()==null){
            return false;
        }else{
            String parentID=this.signup.getParentID().getText();
            File file =new File("src/main/java/Class/Accounts.jsonl");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line = null;
                while((line=reader.readLine())!=null){
                    JSONObject jsonObject= new JSONObject(line);
                    if(parentID.equals(jsonObject.get("ID"))){
                        return true;
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            return false;
        }
    }

    /****** This method registers the user, 每次改变user中的类别信息，该方法均需添加有关的条目 ******/
    public void register(){
        JSONObject jsonObject=new JSONObject();

        // 初始化基本信息
        jsonObject.put("ID",this.signup.getTextField1().getText());
        jsonObject.put("ParentID",this.signup.getParentID().getText());
        jsonObject.put("task_list","");
        jsonObject.put("email","");
        jsonObject.put("Password",new String (this.signup.getPasswordField1().getPassword()));
        jsonObject.put("parentID",this.signup.getParentID().getText());
        // 以下内容初始化有关账户的信息
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentTime = dateFormat.format(cal.getTime());

        jsonObject.put("charge", 0);
        jsonObject.put("timeDeposit", 0);
        jsonObject.put("timeRate", 0);
        jsonObject.put("demandDeposit", 0);
        jsonObject.put("depositTime", currentTime);

        try{
            FileWriter fileWriter=new FileWriter(this.file,true);
            PrintWriter out=new PrintWriter(fileWriter);
            out.write(jsonObject.toString()+"\n");
            fileWriter.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        this.clear();
    }

    // This method clears the fields
    public void clear(){
        this.signup.getTextField1().setText("");
        this.signup.getPasswordField1().setText("");
        this.signup.getPasswordField2().setText("");
        this.signup.getParentID().setText("");
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.signup);
        welcome.repaint();
        welcome.revalidate();
    }
}
