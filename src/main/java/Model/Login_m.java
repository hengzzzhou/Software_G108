package Model;

import View.Login;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Login_m {
    private Login login;

    public Login_m(Login login){
        this.login=login;
    }
    public boolean check(){
        String id=this.login.getTextField1().getText();
        String password=new String(this.login.getPasswordField1().getPassword());
        File file =new File("C:\\Users\\84977\\Desktop\\childBank\\childBank\\src\\main\\java\\Accounts.jsonl");
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
}
