import View.Login;
import View.Settings;
import View.Tutorial;
import View.Main_page;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

import javax.swing.*;

import Class.User;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        User user1 = new User("user1", "hash1");
        System.out.println("successful!");
//        FlatMaterialLighterIJTheme.setup();
//        //test1 test12 = new test1();
//        Login login =new Login();
//        Tutorial tut=new Tutorial();
//        Main_page page=new Main_page();
//        Settings settings = new Settings();
//        JFrame frame= new JFrame();
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        // 设置主界面大小及可见性
//        frame.setSize(1000, 600);
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//        frame.getContentPane().add(settings);
//        frame.repaint();
//        frame.revalidate();
//        frame.setVisible(true);
    }
}
