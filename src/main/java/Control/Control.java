package Control;

import Model.*;
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

    private Welcome_m welcome_m;

    private WelDial welDial;

    private WelDial_m welDial_m;

    private Main_page main_page;
    private Main_page_m main_page_m;
    private Tutorial tutorial;
    private Tutorial_m tutorial_m;

    public void init(){
        this.welcome = new Welcome();

        this.welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置主界面大小及可见性
        this.welcome.setSize(1200, 900);
        this.welcome.setVisible(true);
        this.welcome.setLocationRelativeTo(null);

        this.signup=new Signup();
        this.login=new Login();
        this.welDial=new WelDial(this.welcome);
        this.login_m=new Login_m(this.login);
        this.signup_m=new Signup_m(this.signup);
        this.welcome_m=new Welcome_m(this.welcome);
        this.welDial_m=new WelDial_m(this.welDial);
        this.main_page=new Main_page();
        this.main_page_m=new Main_page_m(this.main_page);
        this.tutorial=new Tutorial();
        this.tutorial_m=new Tutorial_m(this.tutorial);



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

        this.welcome.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Wel2TutMouseClicked(e);
            }
        });
    }

    private void returnMouseClicked(MouseEvent e){
        this.welcome_m.refreshWelcome();
        this.signup_m.clear();
    }
    private void registerMouseClicked(MouseEvent e){
        if(this.signup_m.checkID()){
            if(this.signup_m.checkPassword()) {
                this.signup_m.register();
                this.welcome_m.refreshWelcome();
            }else{
                this.welDial_m.init();
                this.welDial_m.changeVal("Two passwords are different!");
                this.signup_m.clear();
            }
        }else{
            this.welDial_m.init();
            this.welDial_m.changeVal("ID Exists!");
            this.signup_m.clear();
        }
    }

    private void LoginMouseClicked(MouseEvent e){
        if(this.login_m.check()){
            this.main_page_m.init(this.welcome);
        }
    }

    private void LoginButtonMouseClicked(MouseEvent e) {

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
        this.login_m.init(this.welcome);
    }

    private void SignupButtonMouseClicked(MouseEvent e) {

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
        this.signup_m.init(this.welcome);
    }

    private void Wel2TutMouseClicked(MouseEvent e) {
        this.tutorial_m.init(this.welcome);
        this.tutorial.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMouseClicked(e);
            }
        });
    }
}
