package Control;

import Model.*;
import View.*;
import Class.*;
import View.Task;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

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
    private User user_account;
    private int login_flag = 0;
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
    private Task task;
    private Task_m task_m;
    private Home home;
    private Home_m home_m;


    public void init(){
        /* initialize all the components */
        this.basicFrame = new BasicFrame();
        this.basicFrame_close_event();

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
        this.task=new Task();
        this.task_m=new Task_m(this.task);
        this.home=new Home();
        this.home_m=new Home_m(this.home);

        //Initialize the basic frame and welcome page
        this.basicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.basicFrame.setSize(1200, 900);
        this.basicFrame.setVisible(true);
        this.basicFrame.setLocationRelativeTo(null);
        this.welcome_m.refreshWelcome(this.basicFrame);

        //Register all the events
        this.eventRegistration();

    }

    private void basicFrame_close_event(){
        basicFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        // 创建一个实现了WindowListener接口的匿名类实例
        basicFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}
            @Override
            public void windowClosing(WindowEvent e) {
                // 窗口关闭时的事件处理 --> 将user中信息重新存储到jsonl中\
                if (login_flag != 0){
                    File file = new File("src/main/java/Accounts.jsonl");
                    File tempFile = new File("src/main/java/Accounts_temp.jsonl");
                    String line;
                    List<String> lines = new ArrayList<>();
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        // 读取所有条目到列表中
                        while ((line = reader.readLine()) != null) {
                            lines.add(line);
                        }
                        for (int i = 0; i < lines.size(); i++){
                            JSONObject jsonObject = new JSONObject(lines.get(i));
                            /*** 该处需要在jsonl修改时进行修改 ***/
                            if (jsonObject.getString("ID").equals(user_account.getID())) {
                                jsonObject.put("task_list", "123");
                                jsonObject.put("email", user_account.getEmail());

                                lines.set(i, jsonObject.toString());
                            }
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    // 写入新文件并执行替换
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
                        for (String jsonLine : lines) {
                            writer.write(jsonLine);
                            writer.newLine();
                        }
                    }
                    catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    file.delete();
                    tempFile.renameTo(file);
                }
            }
            @Override
            public void windowClosed(WindowEvent e) {}
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e) {}
            @Override
            public void windowDeactivated(WindowEvent e) {}
        });
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
                try {
                    LoginMouseClicked(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
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
        this.main_page.getButtonA().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                taskMouseClicked(e);
            }
        });
        this.task.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMainMouseClicked(e);
            }
        });
        this.main_page.getButtonB().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                taskMouseClicked(e);
            }
        });
        this.main_page.getButtonC().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                taskMouseClicked(e);
            }
        });
        this.main_page.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                homeMouseClicked(e);
            }
        });
        this.home.getButton1().addMouseListener(new MouseAdapter() {
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

    private void LoginMouseClicked(MouseEvent e) throws IOException {
        this.user_account = this.login_m.check();
        if(this.user_account.flag != 0){
            this.login_flag = 1;
            this.main_page_m.init(this.basicFrame, this.user_account);
        }
    }

    private void main2SetMouseClicked(MouseEvent e){
        this.settings_m.init(this.basicFrame);
    }

    private void returnMainMouseClicked(MouseEvent e){
        this.main_page_m.init(this.basicFrame,this.user_account);
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
    private void taskMouseClicked(MouseEvent e){
        this.task_m.init(this.basicFrame);
    }
    private void homeMouseClicked(MouseEvent e){
        this.home_m.init(this.basicFrame);
    }
}
