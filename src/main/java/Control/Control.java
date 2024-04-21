package Control;

import Model.*;
import View.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Control {
    // Register all the components
    private BasicFrame basicFrame;
    private Welcome welcome;
    private Welcome_m welcome_m;
    private Signup signup;
    private Signup_m signup_m;
    private Login login;
    private Login_m login_m;
    private WelDial welDial;
    private WelDial_m welDial_m;
    private Main_page main_page;
    private Main_page_m main_page_m;
    private Tutorial tutorial;
    private Tutorial_m tutorial_m;
    private Settings settings;
    private Settings_m settings_m;

    public void init(){
        //initialize all the components
        this.basicFrame = new BasicFrame();
        this.welcome = new Welcome();
        this.welcome_m=new Welcome_m(this.welcome);
        this.signup=new Signup();
        this.signup_m=new Signup_m(this.signup);
        this.login=new Login();
        this.login_m=new Login_m(this.login);
        this.welDial=new WelDial(this.basicFrame);
        this.welDial_m=new WelDial_m(this.welDial);
        this.main_page=new Main_page();
        this.main_page_m=new Main_page_m(this.main_page);
        this.tutorial=new Tutorial();
        this.tutorial_m=new Tutorial_m(this.tutorial);
        this.settings=new Settings();
        this.settings_m=new Settings_m(this.settings);

        //Initialize the basic frame and welcome page
        this.basicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.basicFrame.setSize(1200, 900);
        this.basicFrame.setVisible(true);
        this.basicFrame.setLocationRelativeTo(null);
        this.welcome_m.refreshWelcome(this.basicFrame);

        //Register all the events
        this.eventRegistration();

    }

    private void eventRegistration() {
        this.welcome.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Wel2LoginButtonMouseClicked(e);
            }
        });

        this.welcome.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Wel2SignupButtonMouseClicked(e);
            }
        });

        this.welcome.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Wel2TutMouseClicked(e);
            }
        });

        this.login.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnWelMouseClicked(e);
            }
        });
        this.login.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginMouseClicked(e);
            }
        });

        this.signup.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnWelMouseClicked(e);
            }
        });
        this.signup.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registerMouseClicked(e);
            }
        });

        this.main_page.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main2SetMouseClicked(e);
            }
        });

        this.tutorial.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnWelMouseClicked(e);
            }
        });

        this.settings.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMainMouseClicked(e);
            }
        });
    }

    private void Wel2LoginButtonMouseClicked(MouseEvent e) {
        this.login_m.init(this.basicFrame);
    }

    private void Wel2SignupButtonMouseClicked(MouseEvent e) {
        this.signup_m.init(this.basicFrame);
    }

    private void Wel2TutMouseClicked(MouseEvent e) {
        this.tutorial_m.init(this.basicFrame);

    }

    private void returnWelMouseClicked(MouseEvent e){
        this.welcome_m.refreshWelcome(this.basicFrame);
        this.signup_m.clear();
    }

    private void registerMouseClicked(MouseEvent e){
        if(this.signup_m.checkID()){
            if(this.signup_m.checkPassword()) {
                this.signup_m.register();
                this.welcome_m.refreshWelcome(this.basicFrame);
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
            this.main_page_m.init(this.basicFrame);

        }
    }

    private void main2SetMouseClicked(MouseEvent e){
        this.settings_m.init(this.basicFrame);
    }

    private void returnMainMouseClicked(MouseEvent e){
        this.main_page_m.init(this.basicFrame);
    }
}
