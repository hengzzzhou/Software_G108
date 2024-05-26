import View.*;
import View.DepositWithdraw.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {
        FlatMaterialLighterIJTheme.setup();
        /****** 在此处进行UI测试，先初始化Jlabel，再将其添加到main frame中以查看 ******/

        //test1 test12 = new test1();
        Login login =new Login();
        Tutorial tut=new Tutorial();
        Main_page page=new Main_page();
        Settings settings = new Settings();
        JFrame frame= new JFrame();
        IDPasswordManagement idPasswordManagement = new IDPasswordManagement();
        ContactUs contactUs = new ContactUs();
        Home home = new Home();
        MainParents mainParents = new MainParents();
        TaskList taskList = new TaskList();

        // 以下内容为存取款UI界面
        DemandDeposit2 ddp2 = new DemandDeposit2();
        TimeDeposit tdp1 = new TimeDeposit();
        TimeDeposit2 tdp2 = new TimeDeposit2();
        AddTask addTask = new AddTask();
        TansferofMoney tom = new TansferofMoney();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置主界面大小及可见性
        frame.setSize(1200, 900);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        // 在此处将Jlabel添加到fram中
        frame.getContentPane().add(tom);

        frame.repaint();
        frame.revalidate();
        frame.setVisible(true);
    }
}
