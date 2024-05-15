package Control;

import Model.*;
import Model.DepositWithdraw.*;
import View.*;
import Class.*;
import View.DepositWithdraw.*;
import View.Task;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
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

    // 以下内容对于存取款部分进行了声明
    private PersonalPage personalPage;
    private PersonalPage_m personalPage_m;

    private WithDrawal chargeWithdraw;
    private Withdrawal_m chargeWithdraw_m;
    private DemandDeposit demandDeposit;
    private DemandDeposit_m demandDeposit_m;
    private DemandDeposit2 demandDeposit2;
    private DemandDeposit2_m demandDeposit2_m;
    private TimeDeposit timeDeposit;
    private TimeDeposit_m timeDeposit_m;
    private TimeDeposit2 timeDeposit2;
    private TimeDeposit2_m timeDeposit2_m;

    public void init(){
        /* initialize all the components */
        this.basicFrame = new BasicFrame();

        // 在此处使用user对于所有的json设置进行更新
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

        // 以下部分对于存取款界面进行了初始化
        this.personalPage=new PersonalPage();
        this.personalPage_m=new PersonalPage_m(this.personalPage);
        this.chargeWithdraw=new WithDrawal();
        this.chargeWithdraw_m=new Withdrawal_m(this.chargeWithdraw);
        this.demandDeposit=new DemandDeposit();
        this.demandDeposit_m=new DemandDeposit_m(this.demandDeposit);
        this.demandDeposit2=new DemandDeposit2();
        this.demandDeposit2_m=new DemandDeposit2_m(this.demandDeposit2);
        this.timeDeposit=new TimeDeposit();
        this.timeDeposit_m=new TimeDeposit_m(this.timeDeposit);
        this.timeDeposit2=new TimeDeposit2();
        this.timeDeposit2_m=new TimeDeposit2_m(this.timeDeposit2);

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
                    File file = new File("src/main/java/Class/Accounts.jsonl");
                    File tempFile = new File("src/main/java/Class/Accounts_temp.jsonl");
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

                                // 以下内容更新了账户的信息
                                jsonObject.put("charge", user_account.getCharge());
                                jsonObject.put("timeDeposit", user_account.getTimeDeposit());
                                jsonObject.put("demandDeposit", user_account.getDemandDeposit());
                                jsonObject.put("depositTime", user_account.getDepositTime());

                                // 以下内容存储了log文件
                                String logPath = "src/main/java/Class/log.txt";
                                try (BufferedWriter writer = new BufferedWriter(new FileWriter(logPath))) {
                                    for (String log : user_account.getLogList()) {
                                        // 写入当前log并添加换行符
                                        writer.write(log);
                                        writer.newLine(); // 添加换行
                                    }
                                } catch (IOException ec) {
                                    // 处理可能发生的I/O异常
                                    ec.printStackTrace();
                                }

                                // 保存信息
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
        // 以下内容为存取钱界面的confirm按钮
        this.chargeWithdraw.getConfirmButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chargeWithdrawCommitMouseClicked(e);
            }
        });
        this.demandDeposit.getConfirmButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                demandDepositCommitMouseClicked(e);
            }
        });
        this.demandDeposit2.getConfirmButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                demandDeposit2CommitMouseClicked(e);
            }
        });
        this.timeDeposit.getConfirmButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                timeDepositCommitMouseClicked(e);
            }
        });
        this.timeDeposit2.getConfirmButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                timeDeposit2CommitMouseClicked(e);
            }
        });
        // 以下内容为存取钱界面的cancel按钮
        this.chargeWithdraw.getCancelButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chargeWithdrawCancelMouseClicked(e);
            }
        });
        this.demandDeposit.getCancelButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                demandDepositCancelMouseClicked(e);
            }
        });
        this.demandDeposit2.getCancelButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                demandDeposit2CancelMouseClicked(e);
            }
        });
        this.timeDeposit.getCancelButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                timeDepositCancelMouseClicked(e);
            }
        });
        this.timeDeposit2.getCancelButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                timeDeposit2CancelMouseClicked(e);
            }
        });

        // 在此处连接personal page
        this.main_page.getHomeButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                homeMouseClicked(e);
            }
        });
        this.personalPage.getReButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RehomeMouseClicked(e);
            }
        });

        // 在此处向5个界面跳转
        this.personalPage.getCWButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CWpageMouseClicked(e);
            }
        });
        this.personalPage.getDDButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DDpageMouseClicked(e);
            }
        });
        this.personalPage.getDWButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DWpageMouseClicked(e);
            }
        });
        this.personalPage.getTDButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TDpageMouseClicked(e);
            }
        });
        this.personalPage.getTWButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TWpageMouseClicked(e);
            }
        });

        // 在此处从5个界面返回
        this.chargeWithdraw.getReButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pageReMouseClicked(e);
            }
        });
        this.timeDeposit.getReButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pageReMouseClicked(e);
            }
        });
        this.timeDeposit2.getReButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pageReMouseClicked(e);
            }
        });
        this.demandDeposit.getReButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pageReMouseClicked(e);
            }
        });
        this.demandDeposit2.getReButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pageReMouseClicked(e);
            }
        });

        // 事件绑定
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
    }

    // 以下内容为与存取钱commit
    private void chargeWithdrawCommitMouseClicked(MouseEvent e) {
        this.user_account = this.chargeWithdraw_m.confirmButton(this.user_account);
    }
    private void demandDepositCommitMouseClicked(MouseEvent e) {
        this.user_account = this.demandDeposit_m.confirmButton(this.user_account);
    }
    private void demandDeposit2CommitMouseClicked(MouseEvent e) {
        this.user_account = this.demandDeposit2_m.confirmButton(this.user_account);
    }
    private void timeDepositCommitMouseClicked(MouseEvent e) {
        this.user_account = this.timeDeposit_m.confirmButton(this.user_account);
    }
    private void timeDeposit2CommitMouseClicked(MouseEvent e) {
        this.user_account = this.timeDeposit2_m.confirmButton(this.user_account);
    }

    // 以下内容为与存取钱cancel
    private void chargeWithdrawCancelMouseClicked(MouseEvent e) {
        this.chargeWithdraw_m.cancelButton();
    }
    private void demandDepositCancelMouseClicked(MouseEvent e) {
        this.demandDeposit_m.cancelButton();
    }
    private void demandDeposit2CancelMouseClicked(MouseEvent e) {
        this.demandDeposit2_m.cancelButton();
    }
    private void timeDepositCancelMouseClicked(MouseEvent e) {
        this.timeDeposit_m.cancelButton();
    }
    private void timeDeposit2CancelMouseClicked(MouseEvent e) {
        this.timeDeposit2_m.cancelButton();
    }

    // homePage
    private void homeMouseClicked(MouseEvent e){
        this.personalPage_m.init(this.basicFrame, this.user_account);
    }
    private void RehomeMouseClicked(MouseEvent e){
        this.main_page_m.init(this.basicFrame, this.user_account);
    }

    // 以下为向五个界面的跳转逻辑
    private void CWpageMouseClicked(MouseEvent e){
        this.chargeWithdraw_m.init(this.basicFrame);
    }
    private void DDpageMouseClicked(MouseEvent e){
        this.demandDeposit_m.init(this.basicFrame);
    }private void DWpageMouseClicked(MouseEvent e){
        this.demandDeposit2_m.init(this.basicFrame);
    }private void TDpageMouseClicked(MouseEvent e){
        this.timeDeposit_m.init(this.basicFrame);
    }
    private void TWpageMouseClicked(MouseEvent e){
        this.timeDeposit2_m.init(this.basicFrame);
    }

    // 以下为5个界面的返回逻辑跳转
    private void pageReMouseClicked(MouseEvent e){
        this.personalPage_m.init(this.basicFrame, this.user_account);
    }


    // 以下为其他内容的事件绑定
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

//    private void withDrawalMouseClicked(MouseEvent e){
//        this.withdrawal_m.init(this.basicFrame);
//    }
}
