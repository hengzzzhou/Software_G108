package Model;

import View.Signup;
import org.json.JSONObject;

import java.io.*;

public class Signup_m {

    private Signup signup;
    private File file=new File("C:\\Users\\84977\\Desktop\\childBank\\childBank\\src\\main\\java\\Accounts.jsonl");

    public Signup_m(Signup signup){
        this.signup=signup;
    }
    public boolean checkID(){
        if(this.signup.getTextField1().getText()==null){
            return false;
        }else{
            String id=this.signup.getTextField1().getText();
            File file =new File("C:\\Users\\84977\\Desktop\\childBank\\childBank\\src\\main\\java\\Accounts.jsonl");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line =null;
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

    public void register(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("ID",this.signup.getTextField1().getText());
        jsonObject.put("Password",new String (this.signup.getPasswordField1().getPassword()));
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

    public void clear(){
        this.signup.getTextField1().setText("");
        this.signup.getPasswordField1().setText("");
        this.signup.getPasswordField2().setText("");
    }
}
