import View.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {
        FlatMaterialLighterIJTheme.setup();
        //test1 test12 = new test1();
        Login login =new Login();
        Tutorial tut=new Tutorial();
        Main_page page=new Main_page();
        Settings settings = new Settings();
        JFrame frame= new JFrame();
        IDPasswordManagement idPasswordManagement = new IDPasswordManagement();
        ContactUs contactUs = new ContactUs();
        Home home = new Home();
        Deposit deposit = new Deposit();
        MainParents mainParents = new MainParents();
        TaskList taskList = new TaskList();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置主界面大小及可见性
        frame.setSize(1200, 900);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(taskList);
        frame.repaint();
        frame.revalidate();
        frame.setVisible(true);
    }
}
