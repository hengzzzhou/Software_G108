package View;

import javax.swing.*;
import net.miginfocom.swing.*;
import org.json.JSONObject;

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
        add(button2, "cell 1 0,wmax 20,hmax 20");
        add(vSpacer1, "cell 3 0,hmin 80");

        //---- label1 ----
        label1.setText("ID");
        add(label1, "cell 3 1,aligny bottom,growy 0");
        add(hSpacer1, "cell 1 2,wmin 150");
        add(textField1, "cell 3 2,dock center,height 40::80");
        add(hSpacer2, "cell 5 2,wmin 150");

        //---- label2 ----
        label2.setText("Password");
        add(label2, "cell 3 4,aligny bottom,growy 0");
        add(passwordField1, "cell 3 5,dock center,height 40::80");
        add(hSpacer4, "cell 3 6");

        //---- button1 ----
        button1.setText("Login_m");
        add(button1, "cell 3 6,dock center,wmax 80,hmax 40");
        add(hSpacer5, "cell 3 6");
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
}
