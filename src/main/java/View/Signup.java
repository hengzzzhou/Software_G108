package View;

import java.awt.event.*;
import java.io.*;
import java.util.Stack;
import javax.swing.*;
import net.miginfocom.swing.*;
import org.json.JSONObject;
/*
 * Created by JFormDesigner on Sat Apr 13 18:38:13 CST 2024
 */



/**
 * @author 84977
 */
public class Signup extends JPanel {
    public Signup() {
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        button2 = new JButton();
        vSpacer1 = new JPanel(null);
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        hSpacer1 = new JPanel(null);
        passwordField1 = new JPasswordField();
        hSpacer2 = new JPanel(null);
        label3 = new JLabel();
        passwordField2 = new JPasswordField();
        hSpacer3 = new JPanel(null);
        button1 = new JButton();
        hSpacer4 = new JPanel(null);
        vSpacer2 = new JPanel(null);

        //======== this ========
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
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
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- button2 ----
        button2.setText("R");
        add(button2, "cell 1 0,wmax 20,hmax 20");
        add(vSpacer1, "cell 2 0,height 60::200");

        //---- label1 ----
        label1.setText("ID");
        add(label1, "cell 2 1,aligny bottom,growy 0");
        add(textField1, "cell 2 2,dock center,hmax 60");

        //---- label2 ----
        label2.setText("Password");
        add(label2, "cell 2 3,aligny bottom,growy 0");
        add(hSpacer1, "cell 1 4,wmin 120");
        add(passwordField1, "cell 2 4,dock center,hmax 60");
        add(hSpacer2, "cell 3 4,wmin 120");

        //---- label3 ----
        label3.setText("Confirm your password");
        add(label3, "cell 2 5,aligny bottom,growy 0");
        add(passwordField2, "cell 2 6,dock center,hmax 60");
        add(hSpacer3, "cell 2 7,wmin 60");

        //---- button1 ----
        button1.setText("Sing Up!");

        add(button1, "cell 2 7,dock center,width :80:100,hmax 50");
        add(hSpacer4, "cell 2 7,wmin 60");
        add(vSpacer2, "cell 2 8,height 60::200");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JButton button2;
    private JPanel vSpacer1;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JPanel hSpacer1;
    private JPasswordField passwordField1;
    private JPanel hSpacer2;
    private JLabel label3;
    private JPasswordField passwordField2;
    private JPanel hSpacer3;
    private JButton button1;
    private JPanel hSpacer4;
    private JPanel vSpacer2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    public JButton getButton2(){
        return this.button2;
    }

    public JButton getButton1(){
        return this.button1;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public JPasswordField getPasswordField2() {
        return passwordField2;
    }
}
