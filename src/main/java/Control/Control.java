package Control;

import Model.Login_m;
import Model.Signup_m;
import View.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Control {
    private Welcome welcome;
    private Signup signup;
    private Login login;

    private Login_m login_m;

    private Signup_m signup_m;

    private IDExists idExists;

    public void init(){
        welcome = new Welcome();

        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置主界面大小及可见性
        welcome.setSize(1200, 900);
        welcome.setVisible(true);
        this.signup=new Signup();
        this.login=new Login();
        this.idExists=new IDExists(this.welcome);
        this.login_m=new Login_m(login);
        this.signup_m=new Signup_m(signup);

        this.welcome.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginButtonMouseClicked(e);
            }
        });

        this.welcome.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SignupButtonMouseClicked(e);
            }
        });
    }

    private void returnMouseClicked(MouseEvent e){
        this.welcome.getContentPane().removeAll();
        this.welcome.repaint();
        this.welcome.getContentPane().add(this.welcome.getPanel1());
        this.welcome.repaint();
        this.welcome.revalidate();
        this.signup_m.clear();
    }
    private void registerMouseClicked(MouseEvent e){
        if(this.signup_m.checkID()){
            if(this.signup_m.checkPassword()) {
                this.signup_m.register();
                this.welcome.getContentPane().removeAll();
                this.welcome.repaint();
                this.welcome.getContentPane().add(this.welcome.getPanel1());
                this.welcome.repaint();
                this.welcome.revalidate();
            }
        }else{
            this.idExists.setSize(400,200);
            this.idExists.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            this.idExists.setVisible(true);
        }
    }
    private void LoginMouseClicked(MouseEvent e){
        if(this.login_m.check()){
            this.welcome.getContentPane().removeAll();
            this.welcome.repaint();
            this.welcome.getContentPane().add(this.welcome.getPanel1());
            this.welcome.repaint();
            this.welcome.revalidate();
        }
    }
    private void LoginButtonMouseClicked(MouseEvent e) {
        this.welcome.getContentPane().removeAll();
        this.welcome.repaint();
        this.login.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMouseClicked(e);
            }
        });
        this.login.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginMouseClicked(e);
            }
        });
        this.welcome.getContentPane().add(this.login);
        this.welcome.repaint();
        this.welcome.revalidate();
    }

    private void SignupButtonMouseClicked(MouseEvent e) {
        this.welcome.getContentPane().removeAll();
        this.welcome.repaint();
        this.signup.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMouseClicked(e);
            }
        });
        this.signup.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registerMouseClicked(e);
            }
        });
        this.welcome.getContentPane().add(this.signup);
        this.welcome.repaint();
        this.welcome.revalidate();// TODO add your code here
    }
}
