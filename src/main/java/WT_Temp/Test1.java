package WT_Temp;

import View.Login;
import View.Main_page;
import View.Settings;
import View.Tutorial;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {
        FlatMaterialLighterIJTheme.setup();
        //test1 test12 = new test1();
        View.Login login =new Login();
        View.Tutorial tut=new Tutorial();
        View.Main_page page=new Main_page();
        View.Settings settings = new Settings();
        JFrame frame= new JFrame();
        WtTest4 test=new WtTest4();
       // Settings test=new Settings();
        demo1 test1 = new demo1();
        demo2 test3 = new demo2();
        demo3 test4 = new demo3();
        demo4 test5 = new demo4();
        Deposit test6 = new Deposit();
        WithDrawal test7 = new WithDrawal();
        new_main test8 = new new_main();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置主界面大小及可见性
        frame.setSize(1200, 900);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(test8);
        frame.repaint();
        frame.revalidate();
        frame.setVisible(true);
    }
}
