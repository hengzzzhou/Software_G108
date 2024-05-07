package Control;

import Model.*;
import View.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Control {
    private User user;
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
    private ContactUs contactUs;
    private ContactUs_m contactUs_m;
    private IDPasswordManagement idPasswordManagement;
    private IDPasswordManagement_m idPasswordManagement_m;
    private Target target;
    private Target_m target_m;
    private Shop shop;
    private Shop_m shop_m;
    private ShoppingTrolley shoppingTrolley;
    private ShoppingTrolley_m shoppingTrolley_m;
    private PurchaseRecord purchaseRecord;
    private PurchaseRecord_m purchaseRecord_m;


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
        this.contactUs=new ContactUs();
        this.contactUs_m=new ContactUs_m(this.contactUs);
        this.idPasswordManagement=new IDPasswordManagement();
        this.idPasswordManagement_m=new IDPasswordManagement_m(this.idPasswordManagement);
        this.target=new Target();
        this.target_m=new Target_m(this.target);
        this.shop=new Shop();
        this.shop_m=new Shop_m(this.shop);
        this.shoppingTrolley=new ShoppingTrolley();
        this.shoppingTrolley_m=new ShoppingTrolley_m(this.shoppingTrolley);
        this.purchaseRecord=new PurchaseRecord();
        this.purchaseRecord_m=new PurchaseRecord_m(this.purchaseRecord);

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

        this.settings.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                changePasswordMouseClicked(e);
            }
        });

        this.idPasswordManagement.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnSettingMouseClicked(e);
            }
        });

        this.settings.getButton5().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                contactUsMouseClicked(e);
            }
        });

        this.contactUs.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnSettingMouseClicked(e);
            }
        });

        this.main_page.getButton5().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                targetMouseClicked(e);
            }
        });

        this.target.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMainMouseClicked(e);
            }
        });

        this.main_page.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                shopMouseClicked(e);
            }
        });
        this.shop.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMainMouseClicked(e);
            }
        });
        this.shop.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                shoppingTrolleyMouseClicked(e);
            }
        });
        this.shoppingTrolley.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                shopMouseClicked(e);
            }
        });
        this.shop.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                purchaseRecordMouseClicked(e);
            }
        });
        this.purchaseRecord.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                shopMouseClicked(e);
            }
        });
        this.settings.getButton6().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnWelMouseClicked(e);
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
            String id=this.login.getTextField1().getText();
            String password=new String(this.login.getPasswordField1().getPassword());
            System.out.println("Initialising user with ID: "+id);
            this.user=new User(id,password);
            this.main_page_m.init(this.basicFrame,this.user);
        }
    }

    private void main2SetMouseClicked(MouseEvent e){
        this.settings_m.init(this.basicFrame);
    }

    private void returnMainMouseClicked(MouseEvent e){
        this.main_page_m.init(this.basicFrame,this.user);
    }

    private void changePasswordMouseClicked(MouseEvent e){
        this.idPasswordManagement_m.init(this.basicFrame);
    }

    private void returnSettingMouseClicked(MouseEvent e){
        this.settings_m.init(this.basicFrame);
    }

    private void contactUsMouseClicked(MouseEvent e){
        this.contactUs_m.init(this.basicFrame);
    }
    private void targetMouseClicked(MouseEvent e){
        this.target_m.init(this.basicFrame);
    }
    private void shopMouseClicked(MouseEvent e){
        this.shop_m.init(this.basicFrame);
    }
    private void shoppingTrolleyMouseClicked(MouseEvent e){
        this.shoppingTrolley_m.init(this.basicFrame);
    }
    private void purchaseRecordMouseClicked(MouseEvent e){
        this.purchaseRecord_m.init(this.basicFrame);
    }
}
