/*
 * Created by JFormDesigner on Sun May 05 20:55:38 CST 2024
 */

package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author captainbluebeard
 */
public class Target extends JPanel {
    public Target() {
        initComponents();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        Spacer vSpacer1 = new Spacer();
        button2 = new JButton();
        label4 = new JLabel();
        button4 = new JButton();
        button3 = new JButton();
        Spacer vSpacer3 = new Spacer();
        label5 = new JLabel();
        button5 = new JButton();
        Spacer hSpacer2 = new Spacer();
        Spacer vSpacer4 = new Spacer();
        label6 = new JLabel();
        Spacer hSpacer4 = new Spacer();
        panel1 = new JPanel();
        progressBar1 = new JProgressBar();
        label1 = new JLabel();
        Spacer hSpacer5 = new Spacer();
        button1 = new JButton();
        Spacer vSpacer5 = new Spacer();
        button6 = new JButton();
        Spacer vSpacer6 = new Spacer();
        panel2 = new JPanel();
        progressBar2 = new JProgressBar();
        label2 = new JLabel();
        Spacer vSpacer7 = new Spacer();
        Spacer hSpacer1 = new Spacer();
        label9 = new JLabel();
        button7 = new JButton();
        button8 = new JButton();
        label12 = new JLabel();
        Spacer hSpacer3 = new Spacer();
        label13 = new JLabel();
        Spacer vSpacer2 = new Spacer();

        //======== this ========
        setOpaque(false);
        setLayout(new GridLayoutManager(16, 11, new Insets(0, 0, 0, 0), -1, -1));

        //---- vSpacer1 ----
        vSpacer1.setOpaque(false);
        add(vSpacer1, new GridConstraints(0, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));

        //---- button2 ----
        button2.setText("R");
        button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button2.setMinimumSize(new Dimension(35, 35));
        button2.setPreferredSize(new Dimension(35, 35));
        button2.setBackground(new Color(0xaaffcc00, true));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        add(button2, new GridConstraints(1, 2, 1, 1,
            GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label4 ----
        label4.setText(" Saving Goals ");
        label4.setFont(new Font("Eras Bold ITC", Font.BOLD, 36));
        label4.setForeground(Color.darkGray);
        label4.setBorder(new LineBorder(Color.white, 2, true));
        add(label4, new GridConstraints(1, 4, 1, 3,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button4 ----
        button4.setMinimumSize(new Dimension(45, 45));
        button4.setMaximumSize(new Dimension(60, 60));
        button4.setPreferredSize(new Dimension(35, 35));
        button4.setFont(new Font("Eras Bold ITC", Font.BOLD, 17));
        button4.setBackground(new Color(0xbdffcc00, true));
        button4.setForeground(new Color(0xefefef));
        button4.setText(" \ud83e\uddee");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button4, new GridConstraints(1, 8, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button3 ----
        button3.setText("?");
        button3.setMinimumSize(new Dimension(45, 45));
        button3.setMaximumSize(new Dimension(60, 60));
        button3.setPreferredSize(new Dimension(35, 35));
        button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 17));
        button3.setBackground(new Color(0xbdffcc00, true));
        button3.setForeground(new Color(0xefefef));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button3, new GridConstraints(1, 9, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- vSpacer3 ----
        vSpacer3.setOpaque(false);
        add(vSpacer3, new GridConstraints(2, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));

        //---- label5 ----
        label5.setText("My Goals");
        label5.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
        label5.setForeground(Color.darkGray);
        add(label5, new GridConstraints(3, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button5 ----
        button5.setText("Save $20 for a new toy");
        button5.setFont(new Font("Euphemia UCAS", Font.BOLD, 15));
        add(button5, new GridConstraints(3, 4, 1, 3,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        add(hSpacer2, new GridConstraints(3, 10, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            null, null, null));
        add(vSpacer4, new GridConstraints(4, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));

        //---- label6 ----
        label6.setText("Process");
        label6.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
        label6.setForeground(Color.darkGray);
        add(label6, new GridConstraints(5, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        add(hSpacer4, new GridConstraints(5, 3, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            null, null, null));

        //======== panel1 ========
        {
            panel1.setOpaque(false);
            panel1.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- progressBar1 ----
            progressBar1.setValue(75);
            progressBar1.setMaximumSize(new Dimension(32767, 10));
            progressBar1.setPreferredSize(new Dimension(146, 10));
            progressBar1.setForeground(new Color(0x3399ff));
            panel1.add(progressBar1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label1 ----
            label1.setText("15");
            panel1.add(label1, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        add(panel1, new GridConstraints(5, 4, 1, 3,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        add(hSpacer5, new GridConstraints(5, 7, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            null, null, null));

        //---- button1 ----
        button1.setText("\u2795 New Goal");
        button1.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        add(button1, new GridConstraints(5, 8, 1, 2,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- vSpacer5 ----
        vSpacer5.setOpaque(false);
        add(vSpacer5, new GridConstraints(6, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));

        //---- button6 ----
        button6.setText("Do household and get $10 ");
        button6.setFont(new Font("Euphemia UCAS", Font.BOLD, 15));
        add(button6, new GridConstraints(7, 4, 1, 3,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- vSpacer6 ----
        vSpacer6.setOpaque(false);
        add(vSpacer6, new GridConstraints(8, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setOpaque(false);
            panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- progressBar2 ----
            progressBar2.setValue(30);
            progressBar2.setMaximumSize(new Dimension(32767, 10));
            progressBar2.setPreferredSize(new Dimension(146, 10));
            progressBar2.setForeground(new Color(0x3399ff));
            panel2.add(progressBar2, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label2 ----
            label2.setText("3");
            panel2.add(label2, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        add(panel2, new GridConstraints(9, 4, 1, 3,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- vSpacer7 ----
        vSpacer7.setOpaque(false);
        add(vSpacer7, new GridConstraints(10, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));
        add(hSpacer1, new GridConstraints(11, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            null, null, null));

        //---- label9 ----
        label9.setText(" Achievements");
        label9.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
        label9.setForeground(Color.darkGray);
        add(label9, new GridConstraints(11, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button7 ----
        button7.setText("1");
        button7.setFont(new Font("Inter", Font.BOLD, 20));
        add(button7, new GridConstraints(11, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button8 ----
        button8.setText("7");
        button8.setFont(new Font("Inter", Font.BOLD, 20));
        add(button8, new GridConstraints(11, 6, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label12 ----
        label12.setText("First try");
        label12.setFont(new Font("Eras Bold ITC", Font.PLAIN, 24));
        label12.setForeground(Color.darkGray);
        add(label12, new GridConstraints(12, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        add(hSpacer3, new GridConstraints(12, 5, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            null, null, null));

        //---- label13 ----
        label13.setText("Use for a week");
        label13.setFont(new Font("Eras Bold ITC", Font.PLAIN, 24));
        label13.setForeground(Color.darkGray);
        add(label13, new GridConstraints(12, 6, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        add(vSpacer2, new GridConstraints(13, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JButton button2;
    private JLabel label4;
    private JButton button4;
    private JButton button3;
    private JLabel label5;
    private JButton button5;
    private JLabel label6;
    private JPanel panel1;
    private JProgressBar progressBar1;
    private JLabel label1;
    private JButton button1;
    private JButton button6;
    private JPanel panel2;
    private JProgressBar progressBar2;
    private JLabel label2;
    private JLabel label9;
    private JButton button7;
    private JButton button8;
    private JLabel label12;
    private JLabel label13;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/target.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getButton2() {
        return button2;
    }
}
