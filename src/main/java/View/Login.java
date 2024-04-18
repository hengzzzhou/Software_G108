package View;

import javax.swing.*;
import net.miginfocom.swing.*;
import org.json.JSONObject;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Created by JFormDesigner on Sat Apr 13 18:20:06 CST 2024
 */



/**
 * @author 84977
 */
public class Login extends JPanel {
    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        button2 = new JButton();
        vSpacer1 = new JPanel(null);
        label1 = new JLabel();
        hSpacer1 = new JPanel(null);
        textField1 = new JTextField();
        hSpacer2 = new JPanel(null);
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        hSpacer4 = new JPanel(null);
        button1 = new JButton();
        hSpacer5 = new JPanel(null);
        vSpacer3 = new JPanel(null);

        //======== this ========
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[84]" +
            "[]" +
            "[]"));

        //---- button2 ----
        button2.setText("R");
        button2.setFont(new Font("Georgia", Font.BOLD, 12));
        add(button2, "cell 1 0,width 30:30:40,height 30:30:40");

        //---- vSpacer1 ----
        vSpacer1.setOpaque(false);
        add(vSpacer1, "cell 3 0,hmin 80");

        //---- label1 ----
        label1.setText("ID");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Georgia", Font.BOLD, 36));
        add(label1, "cell 3 1,aligny bottom,growy 0");

        //---- hSpacer1 ----
        hSpacer1.setOpaque(false);
        add(hSpacer1, "cell 1 2,wmin 150");
        add(textField1, "cell 3 2,dock center,height 40::80");

        //---- hSpacer2 ----
        hSpacer2.setOpaque(false);
        add(hSpacer2, "cell 5 2,wmin 150");

        //---- label2 ----
        label2.setText("Password");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Georgia", Font.BOLD, 36));
        add(label2, "cell 3 4,aligny bottom,growy 0");
        add(passwordField1, "cell 3 5,dock center,height 40::80");

        //---- hSpacer4 ----
        hSpacer4.setOpaque(false);
        add(hSpacer4, "cell 3 6");

        //---- button1 ----
        button1.setText("Login");
        button1.setFont(new Font("Georgia", Font.BOLD, 12));
        add(button1, "cell 3 6,dock center,width 40::80,height 20::40");

        //---- hSpacer5 ----
        hSpacer5.setOpaque(false);
        add(hSpacer5, "cell 3 6");

        //---- vSpacer3 ----
        vSpacer3.setOpaque(false);
        add(vSpacer3, "cell 3 7,hmin 60");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JButton button2;
    private JPanel vSpacer1;
    private JLabel label1;
    private JPanel hSpacer1;
    private JTextField textField1;
    private JPanel hSpacer2;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JPanel hSpacer4;
    private JButton button1;
    private JPanel hSpacer5;
    private JPanel vSpacer3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JButton getButton2(){
        return this.button2;
    }
    public JButton getButton1(){
        return this.button1;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/welcome.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
}
