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
        label3 = new JLabel();
        button3 = new JButton();
        vSpacer2 = new JPanel(null);
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
            "[]" +
            "[]" +
            "[84]" +
            "[]" +
            "[]"));

        //---- button2 ----
        button2.setText("R");
        button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button2.setBackground(new Color(0xa5ffcc00, true));
        button2.setForeground(new Color(0xadefefef, true));
        add(button2, "cell 1 0,width 30:30:40,height 30:30:40");

        //---- vSpacer1 ----
        vSpacer1.setOpaque(false);
        add(vSpacer1, "cell 3 0,hmin 80");

        //---- label3 ----
        label3.setText("Are you parents?");
        label3.setMaximumSize(new Dimension(800, 17));
        label3.setPreferredSize(new Dimension(700, 17));
        label3.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        label3.setForeground(new Color(0xefefef));
        label3.setMinimumSize(new Dimension(200, 14));
        add(label3, "cell 3 1");

        //---- button3 ----
        button3.setText("YES!");
        button3.setPreferredSize(new Dimension(40, 27));
        button3.setMinimumSize(new Dimension(40, 27));
        button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button3.setForeground(Color.black);
        button3.setBackground(new Color(0x0099ff));
        add(button3, "cell 3 1");

        //---- vSpacer2 ----
        vSpacer2.setOpaque(false);
        add(vSpacer2, "cell 3 2");

        //---- label1 ----
        label1.setText("ID");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 36));
        add(label1, "cell 3 3,aligny bottom,growy 0");

        //---- hSpacer1 ----
        hSpacer1.setOpaque(false);
        add(hSpacer1, "cell 1 4,wmin 150");
        add(textField1, "cell 3 4,dock center,height 40::80");

        //---- hSpacer2 ----
        hSpacer2.setOpaque(false);
        add(hSpacer2, "cell 5 4,wmin 150");

        //---- label2 ----
        label2.setText("Password");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Eras Bold ITC", Font.BOLD, 36));
        add(label2, "cell 3 6,aligny bottom,growy 0");
        add(passwordField1, "cell 3 7,dock center,height 40::80");

        //---- hSpacer4 ----
        hSpacer4.setOpaque(false);
        add(hSpacer4, "cell 3 8");

        //---- button1 ----
        button1.setText("Login");
        button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button1.setBackground(new Color(0x6ce824));
        button1.setForeground(new Color(0xefefef));
        add(button1, "cell 3 8,dock center,width 40::80,height 20::40");

        //---- hSpacer5 ----
        hSpacer5.setOpaque(false);
        add(hSpacer5, "cell 3 8");

        //---- vSpacer3 ----
        vSpacer3.setOpaque(false);
        add(vSpacer3, "cell 3 9,hmin 60");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JButton button2;
    private JPanel vSpacer1;
    private JLabel label3;
    private JButton button3;
    private JPanel vSpacer2;
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
        ImageIcon image =new ImageIcon("src/main/imgs/welcome_dark.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getButton3() {
        return button3;
    }
    public JLabel getLabel3() {
        return label3;
    }
}
