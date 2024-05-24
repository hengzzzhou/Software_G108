package View;

import java.awt.*;
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

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        button2 = new JButton();
        vSpacer1 = new JPanel(null);
        label4 = new JLabel();
        label5 = new JLabel();
        button3 = new JButton();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        hSpacer1 = new JPanel(null);
        passwordField1 = new JPasswordField();
        hSpacer2 = new JPanel(null);
        label3 = new JLabel();
        passwordField2 = new JPasswordField();
        label6 = new JLabel();
        hSpacer5 = new JPanel(null);
        textField2 = new JTextField();
        hSpacer3 = new JPanel(null);
        button1 = new JButton();
        hSpacer4 = new JPanel(null);
        vSpacer2 = new JPanel(null);

        //======== this ========
        setOpaque(false);
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
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- button2 ----
        button2.setText("R");
        button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button2.setBackground(new Color(0xa9ffcc00, true));
        button2.setForeground(new Color(0xefefef));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        add(button2, "cell 1 0,width 30:30:40,height 30:30:40");

        //---- vSpacer1 ----
        vSpacer1.setOpaque(false);
        add(vSpacer1, "cell 2 0,hmin 60");

        //---- label4 ----
        label4.setText("Welcome to Join Us!");
        label4.setFont(new Font("Eras Bold ITC", Font.BOLD, 36));
        label4.setForeground(Color.white);
        add(label4, "cell 2 2,alignx center,growx 0");

        //---- label5 ----
        label5.setText("Are your parents?");
        label5.setMaximumSize(new Dimension(800, 17));
        label5.setPreferredSize(new Dimension(750, 17));
        label5.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
        label5.setForeground(new Color(0xefefef));
        add(label5, "cell 2 3");

        //---- button3 ----
        button3.setText("YES!");
        button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button3.setBackground(new Color(0x3399ff));
        button3.setForeground(Color.black);
        add(button3, "cell 2 3");

        //---- label1 ----
        label1.setText("ID");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 36));
        add(label1, "cell 2 4,aligny bottom,growy 0");

        //---- textField1 ----
        textField1.setBackground(new Color(0xefefef));
        add(textField1, "cell 2 5,dock center,hmax 60");

        //---- label2 ----
        label2.setText("Password");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Eras Bold ITC", Font.BOLD, 36));
        add(label2, "cell 2 6,aligny bottom,growy 0");

        //---- hSpacer1 ----
        hSpacer1.setOpaque(false);
        add(hSpacer1, "cell 1 7,wmin 120");

        //---- passwordField1 ----
        passwordField1.setBackground(new Color(0xefefef));
        add(passwordField1, "cell 2 7,dock center,hmax 60");
        add(hSpacer2, "cell 3 7,wmin 120");

        //---- label3 ----
        label3.setText("Confirm your password");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Eras Bold ITC", Font.BOLD, 36));
        add(label3, "cell 2 8,aligny bottom,growy 0");

        //---- passwordField2 ----
        passwordField2.setBackground(new Color(0xefefef));
        add(passwordField2, "cell 2 9,dock center,hmax 60");

        //---- label6 ----
        label6.setText("Parent ID");
        label6.setForeground(new Color(0xefefef));
        label6.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        add(label6, "cell 2 10");

        //---- hSpacer5 ----
        hSpacer5.setOpaque(false);
        add(hSpacer5, "cell 2 10");

        //---- textField2 ----
        textField2.setPreferredSize(new Dimension(150, 40));
        add(textField2, "cell 2 10");

        //---- hSpacer3 ----
        hSpacer3.setOpaque(false);
        add(hSpacer3, "cell 2 11,wmin 60");

        //---- button1 ----
        button1.setText("Sing Up!");
        button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button1.setBackground(new Color(0x6ce824));
        button1.setForeground(new Color(0xefefef));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        add(button1, "cell 2 11,dock center,width :80:100,hmax 50");

        //---- hSpacer4 ----
        hSpacer4.setOpaque(false);
        add(hSpacer4, "cell 2 11,wmin 60");

        //---- vSpacer2 ----
        vSpacer2.setOpaque(false);
        add(vSpacer2, "cell 2 12,height 60::200");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JButton button2;
    private JPanel vSpacer1;
    private JLabel label4;
    private JLabel label5;
    private JButton button3;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JPanel hSpacer1;
    private JPasswordField passwordField1;
    private JPanel hSpacer2;
    private JLabel label3;
    private JPasswordField passwordField2;
    private JLabel label6;
    private JPanel hSpacer5;
    private JTextField textField2;
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

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/welcome_dark.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getButton3() {
        return button3;
    }
    public JTextField getParentID(){
        return textField2;
    }
}
