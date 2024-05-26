package Control;

import Model.*;
import Model.DepositWithdraw.*;
import View.*;
import Class.*;
import View.DepositWithdraw.*;
import View.TaskView;
import org.json.JSONArray;
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
    private Child child_account;
    private Parent parent_account;
    private int login_flag = 0;
    private ContactUs contactUs;
    private ContactUs_m contactUs_m;
    private IDPasswordManagement idPasswordManagement;
    private IDPasswordManagement_m idPasswordManagement_m;
    private Shop shop;
    private Shop_m shop_m;
    private ShoppingTrolley shoppingTrolley;
    private ShoppingTrolley_m shoppingTrolley_m;
    private PurchaseRecord purchaseRecord;
    private PurchaseRecord_m purchaseRecord_m;
    private TaskView taskView;
    private Task_m taskView_m;

    private SignupParent signupParent;
    private SignupParent_m signupParent_m;
    private TaskListChild taskListChild;
    private TaskListChild_m taskListChild_m;
    private Login loginParent;
    private Login_m loginParent_m;

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
    private MainParents mainParents;
    private MainParents_m mainParents_m;
    private TaskList taskList;
    private TaskList_m taskList_m;
    private AddTask addTask;
    private AddTask_m addTask_m;
    private TansferofMoney transferofMoney;
    private TransferOfMoney_m transferofMoney_m;


    // transaction
    private Transaction transaction;
    private Transaction_m transaction_m;

    // goal
    private SetGoal setGoal;
    private SetGoal_m setGoal_m;

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
        this.setGoal = new SetGoal();
        this.setGoal_m = new SetGoal_m(this.setGoal);
        this.shop=new Shop();
        this.shop_m=new Shop_m(this.shop);
        this.shoppingTrolley=new ShoppingTrolley();
        this.shoppingTrolley_m=new ShoppingTrolley_m(this.shoppingTrolley);
        this.purchaseRecord=new PurchaseRecord();
        this.purchaseRecord_m=new PurchaseRecord_m(this.purchaseRecord);
        this.taskView=new TaskView();
        this.taskView_m=new Task_m(this.taskView);
        this.mainParents=new MainParents();
        this.mainParents_m=new MainParents_m(this.mainParents);
        this.taskList=new TaskList();
        this.taskList_m=new TaskList_m(this.taskList, this.basicFrame);
        this.addTask=new AddTask();
        this.addTask_m=new AddTask_m(this.addTask);
        this.signupParent = new SignupParent();
        this.signupParent_m = new SignupParent_m(this.signupParent);
        this.taskListChild = new TaskListChild();
        this.taskListChild_m = new TaskListChild_m(this.taskListChild, this.basicFrame);
        this.loginParent = new Login();
        this.loginParent_m = new Login_m(this.loginParent);
        this.transferofMoney = new TansferofMoney();
        this.transferofMoney_m = new TransferOfMoney_m(this.transferofMoney);


        // 以下部分对于存取款界面进行了初始化
        this.personalPage = new PersonalPage();
        this.personalPage_m = new PersonalPage_m(this.personalPage);
        this.chargeWithdraw = new WithDrawal();
        this.chargeWithdraw_m = new Withdrawal_m(this.chargeWithdraw);
        this.demandDeposit = new DemandDeposit();
        this.demandDeposit_m = new DemandDeposit_m(this.demandDeposit);
        this.demandDeposit2 = new DemandDeposit2();
        this.demandDeposit2_m = new DemandDeposit2_m(this.demandDeposit2);
        this.timeDeposit = new TimeDeposit();
        this.timeDeposit_m = new TimeDeposit_m(this.timeDeposit);
        this.timeDeposit2 = new TimeDeposit2();
        this.timeDeposit2_m = new TimeDeposit2_m(this.timeDeposit2);

        // 记录
        this.transaction = new Transaction();
        this.transaction_m = new Transaction_m(transaction);

        // Initialize the basic frame and welcome page
        this.basicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.basicFrame.setSize(1200, 900);
        this.basicFrame.setVisible(true);
        this.basicFrame.setLocationRelativeTo(null);
        this.welcome_m.refreshWelcome(this.basicFrame);

        // Register all the events
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
                // 窗口关闭时的事件处理 --> 将user中信息重新存储到jsonl中
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
                            if (jsonObject.getString("ID").equals(child_account.getID())) {
                                jsonObject.put("task_list", "123");
                                jsonObject.put("email", child_account.getEmail());
                                jsonObject.put("ParentID", child_account.getParentID());
                                System.out.println(child_account.getParentID());

                                // 以下内容更新了账户的信息
                                jsonObject.put("charge", child_account.getCharge());
                                jsonObject.put("timeDeposit", child_account.getTimeDeposit());
                                jsonObject.put("demandDeposit", child_account.getDemandDeposit());
                                jsonObject.put("depositTime", child_account.getDepositTime());

                                // 以下内容存储了log文件
                                String logPath = "src/main/java/Class/log.txt";
                                try (BufferedWriter writer = new BufferedWriter(new FileWriter(logPath))) {
                                    for (String log : child_account.getLogList()) {
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

                                // Save logList to file
                                child_account.setLogList(child_account.getLogList());

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
                    child_account.dumpTaskList();
                }
                if(parent_account != null){
                    parent_account.dumpTaskList();
                    parent_account.setLogList(parent_account.getLogList());
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
        this.transaction.getReButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(parent_account!=null)parentReMouseClicked(e);
                else pageReMouseClicked(e);
            }
        });
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

        // transaction -zh
        this.personalPage.getTransactionButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                transactionPageMouseClicked(e);
            }
        });


        // goal -zh

        this.setGoal.getButtonReturn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RehomeMouseClicked(e);
            }
        });
        this.setGoal.getButtonConfirm().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                confirmGoal(e);
                RehomeMouseClicked(e);
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
                goalMouseClicked(e);
            }
        });

//        this.target.getButton2().addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                returnMainMouseClicked(e);
//            }
//        });


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
        this.taskView.getButton2().addMouseListener(new MouseAdapter() {
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

        this.login.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                parentLoginMouseClicked(e);
            }
        });
        this.mainParents.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Wel2LoginButtonMouseClicked(e);
            }
        });
        this.mainParents.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TaskListMouseClicked(e);
            }
        });
        this.mainParents.getTransactionRecordButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                transactionPageMouseClicked(e);
            }
        });
        this.taskList.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMainParentsMouseClicked(e);
            }
        });

        this.taskList.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addTasksMouseClicked(e);
            }
        });
        this.addTask.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TaskListMouseClicked(e);
            }
        });
        this.addTask.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                PublishTaskMouseClicked(e);
            }
        });
        this.taskList_m.getAddTask().getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TaskListMouseClicked(e);
            }
        });

        this.signup.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SignupParentMouseClicked(e);
            }
        });
        this.signupParent.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnWelMouseClicked(e);
            }
        });
        this.taskListChild.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMainMouseClicked(e);
            }
        });
        this.taskListChild_m.getAddTask().getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                taskMouseClicked(e);
            }
        });

        this.loginParent.getButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnWelMouseClicked(e);
            }
        });
        this.loginParent.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainParentsMouseClicked(e);
            }
        });
        this.signupParent.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registerParentsMouseClicked(e);
            }
        });
        this.mainParents.getButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                transferMouseClicked(e);
            }
        });
        this.transferofMoney.getButton1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                returnMainParentsMouseClicked(e);
            }
        });
        this.transferofMoney.getConfirmButton2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                transferMoneyMouseClicked(e);
            }
        });
        this.transferofMoney.getCancelButton3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                transferCancelsMouseClicked(e);
            }
        });
    }

    private void transferCancelsMouseClicked(MouseEvent e) {
        this.transferofMoney.getTransferField5().setText("");
    }

    private void transferMoneyMouseClicked(MouseEvent e) {
        this.transferofMoney_m.transferMoney(this.parent_account);
    }

    private void transferMouseClicked(MouseEvent e) {
        this.transferofMoney_m.initMoney(this.parent_account);
        this.transferofMoney_m.init(this.basicFrame);
    }

    private void registerParentsMouseClicked(MouseEvent e) {
        boolean flag = true;
        if(!this.signupParent_m.checkNull()){
            flag = false;
            this.welDial_m.init();
            this.welDial_m.changeVal("Please fill in all the information!");
            this.signupParent_m.clear();
        }
        if(!this.signupParent_m.checkID()){
            flag = false;
            this.welDial_m.init();
            this.welDial_m.changeVal("ID Exists!");
            this.signupParent_m.clear();
        }
        if(!this.signupParent_m.checkPassword()) {
            flag = false;
            this.welDial_m.init();
            this.welDial_m.changeVal("Two passwords are different!");
            this.signupParent_m.clear();
        }
        if (flag) {
            this.signupParent_m.registerParent();
            this.returnWelMouseClicked(e);
        }
    }

    private void parentLoginMouseClicked(MouseEvent e) {
        loginParent_m.initParent(this.basicFrame);
    }

    private void SignupParentMouseClicked(MouseEvent e) {
        this.signupParent_m.init(this.basicFrame);
    }

    private void returnMainParentsMouseClicked(MouseEvent e) {
        this.mainParents_m.init(this.basicFrame);
    }

    private void PublishTaskMouseClicked(MouseEvent e) {
        int len = this.parent_account.getTasks().size()+1;
        Task task = this.addTask_m.setTask(String.valueOf(len));
        if(task!=null){
            this.parent_account.addTask(task);
            this.taskList_m.showTasks(this.parent_account.getTasks());
            this.taskList_m.init(this.basicFrame);
            this.addTask_m.clearFields();
        }

    }

    private void addTasksMouseClicked(MouseEvent e) {
        this.addTask_m.init(this.basicFrame);
    }

    private void TaskListMouseClicked(MouseEvent e) {
        this.taskList_m.showTasks(this.parent_account.getTasks());
        this.taskList_m.init(this.basicFrame);
    }

    private void mainParentsMouseClicked(MouseEvent e) {
        try {
            this.parent_account = this.loginParent_m.checkParent();
            if(this.parent_account!=null) {
                this.parent_account.loadTaskList();
                this.mainParents_m.init(this.basicFrame);
            }else{
                this.welDial_m.init();
                this.welDial_m.changeVal("ID or Password is wrong!");
                this.loginParent_m.clear();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    // 以下内容为与存取钱commit
    private void chargeWithdrawCommitMouseClicked(MouseEvent e) {
        this.child_account = this.chargeWithdraw_m.confirmButton(this.child_account);
    }
    private void demandDepositCommitMouseClicked(MouseEvent e) {
        this.child_account = this.demandDeposit_m.confirmButton(this.child_account);
    }
    private void demandDeposit2CommitMouseClicked(MouseEvent e) {
        this.child_account = this.demandDeposit2_m.confirmButton(this.child_account);
    }
    private void timeDepositCommitMouseClicked(MouseEvent e) {
        this.child_account = this.timeDeposit_m.confirmButton(this.child_account);
    }
    private void timeDeposit2CommitMouseClicked(MouseEvent e) {
        this.child_account = this.timeDeposit2_m.confirmButton(this.child_account);
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
        this.personalPage_m.init(this.basicFrame, this.child_account);
    }
    private void RehomeMouseClicked(MouseEvent e){
        this.main_page_m.init(this.basicFrame, this.child_account);
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

    private void transactionPageMouseClicked(MouseEvent e){
        if(parent_account!=null){this.transaction_m.init(this.basicFrame, this.parent_account);}
        else this.transaction_m.init(this.basicFrame, this.child_account);

    }

    // 以下为5个界面的返回逻辑跳转
    private void pageReMouseClicked(MouseEvent e){
        this.personalPage_m.init(this.basicFrame, this.child_account);
    }

    private void parentReMouseClicked(MouseEvent e){
        this.mainParents_m.init(this.basicFrame);
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
        boolean flag = true;
        if(!this.signup_m.checkNull()){
            flag = false;
            this.welDial_m.init();
            this.welDial_m.changeVal("Please fill in all the information!");
            this.signup_m.clear();
            return;
        }
        if(!this.signup_m.checkID()){
            flag = false;
            this.welDial_m.init();
            this.welDial_m.changeVal("ID Exists!");
            this.signup_m.clear();
            return;
        }
        if(!this.signup_m.checkPassword()) {
            flag = false;
            this.welDial_m.init();
            this.welDial_m.changeVal("Two passwords are different!");
            this.signup_m.clear();
            return;
        }
        if(!this.signup_m.checkParentID()){
            flag = false;
            this.welDial_m.init();
            this.welDial_m.changeVal("Parent ID does not exist!");
            this.signup_m.clear();
            return;
        }
        if(flag){
            this.signup_m.register();
            this.welcome_m.refreshWelcome(this.basicFrame);
        }

    }

    private void LoginMouseClicked(MouseEvent e) throws IOException {
        this.child_account = this.login_m.check();
        if(this.child_account!=null){
            this.child_account.loadTaskList();//bug
            if(this.child_account.flag != 0){
                this.login_flag = 1;
                this.main_page_m.init(this.basicFrame, this.child_account);
            }
        }else{
            this.welDial_m.init();
            this.welDial_m.changeVal("ID or Password is wrong!");
            this.login_m.clear();
        }

    }


    private void main2SetMouseClicked(MouseEvent e){
        this.settings_m.init(this.basicFrame);
    }

    private void returnMainMouseClicked(MouseEvent e){
        this.main_page_m.init(this.basicFrame,this.child_account);
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
    private void goalMouseClicked(MouseEvent e){
        this.setGoal_m.init(this.basicFrame);
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
        this.taskListChild_m.showTasks(this.child_account.getTasks());
        this.taskListChild_m.init(this.basicFrame);
    }

    private void confirmGoal(MouseEvent e) {
        this.child_account = this.setGoal_m.confirmButton(this.child_account);
    }
//    private void withDrawalMouseClicked(MouseEvent e){
//        this.withdrawal_m.init(this.basicFrame);
//    }
}
