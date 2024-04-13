package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Apr 13 16:45:11 CST 2024
 */



/**
 * @author 84977
 */
public class Welcome extends JFrame {
    public Welcome() {
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel1 = new JPanel();
        textField1 = new JTextField();
        hSpacer2 = new JPanel(null);
        button1 = new JButton();
        hSpacer1 = new JPanel(null);
        button2 = new JButton();
        hSpacer3 = new JPanel(null);

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout());

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
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
                "[]" +
                "[]"));

            //---- textField1 ----
            textField1.setText("Welcome to the Children's Virtual Bank!");
            textField1.setHorizontalAlignment(SwingConstants.CENTER);
            textField1.setFont(new Font("Georgia", Font.BOLD, 36));
            textField1.setBorder(null);
            textField1.setBackground(new Color(0x00ffffff, true));
            panel1.add(textField1, "cell 6 4,dock center");
            panel1.add(hSpacer2, "cell 6 5");

            //---- button1 ----
            button1.setText("Log In");
            button1.setFont(new Font("Georgia", Font.BOLD, 18));
            panel1.add(button1, "cell 6 5,wmax 120");
            panel1.add(hSpacer1, "cell 6 5");

            //---- button2 ----
            button2.setText("Sign Up");
            button2.setFont(new Font("Georgia", Font.BOLD, 18));
            panel1.add(button2, "cell 6 5,wmax 120");
            panel1.add(hSpacer3, "cell 6 5");
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JPanel panel1;
    private JTextField textField1;
    private JPanel hSpacer2;
    private JButton button1;
    private JPanel hSpacer1;
    private JButton button2;
    private JPanel hSpacer3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    public JPanel getPanel1() {
        return this.panel1;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }
}
