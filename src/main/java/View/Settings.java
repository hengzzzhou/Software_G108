/*
 * Created by JFormDesigner on Fri Apr 19 14:16:21 CST 2024
 */

package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 84977
 */
public class Settings extends JPanel {
    public Settings() {
        initComponents();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 
        panel1 = new JPanel();
        button2 = new JButton();
        panel2 = new JPanel();
        label4 = new JLabel();
        Spacer vSpacer3 = new Spacer();
        panel4 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        panel5 = new JPanel();
        button1 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        Spacer vSpacer1 = new Spacer();

        //======== this ========
        setOpaque(false);
        setLayout(new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setOpaque(false);

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

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
        }
        add(panel1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setOpaque(false);

            //---- label4 ----
            label4.setText("Settings");
            label4.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
            label4.setForeground(new Color(0xefefef));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(label4)
                        .addGap(38, 38, 38))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label4)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        add(panel2, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        add(vSpacer3, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));

        //======== panel4 ========
        {
            panel4.setMinimumSize(new Dimension(200, 400));
            panel4.setOpaque(false);

            //---- label1 ----
            label1.setText("ID & Password Management");
            label1.setForeground(new Color(0xefefef));
            label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));

            //---- label2 ----
            label2.setText("Languages");
            label2.setForeground(new Color(0xefefef));
            label2.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));

            //---- label3 ----
            label3.setText("Notice");
            label3.setForeground(new Color(0xefefef));
            label3.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));

            //---- label5 ----
            label5.setText("Theme");
            label5.setForeground(new Color(0xefefef));
            label5.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));

            //---- label6 ----
            label6.setText("Contact Us");
            label6.setForeground(new Color(0xefefef));
            label6.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));

            //---- label7 ----
            label7.setText("Log out");
            label7.setForeground(new Color(0xefefef));
            label7.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addComponent(label5)
                                    .addComponent(label1)
                                    .addComponent(label7)
                                    .addGroup(panel4Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(label3)))
                                .addContainerGap(139, Short.MAX_VALUE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addComponent(label6)
                                    .addComponent(label2))
                                .addGap(0, 305, Short.MAX_VALUE))))
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(56, 56, 56)
                        .addComponent(label2)
                        .addGap(60, 60, 60)
                        .addComponent(label3)
                        .addGap(59, 59, 59)
                        .addComponent(label5)
                        .addGap(56, 56, 56)
                        .addComponent(label6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(label7))
            );
        }
        add(panel4, new GridConstraints(2, 0, 1, 2,
            GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel5 ========
        {
            panel5.setMinimumSize(new Dimension(0, 420));
            panel5.setOpaque(false);

            //---- button1 ----
            button1.setText("Go");
            button1.setBackground(new Color(0x3366ff));
            button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
            button1.setForeground(new Color(0xefefef));

            //---- button3 ----
            button3.setText("Go");
            button3.setBackground(new Color(0x3366ff));
            button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
            button3.setForeground(new Color(0xefefef));

            //---- button4 ----
            button4.setText("Go");
            button4.setBackground(new Color(0x3366ff));
            button4.setForeground(new Color(0xefefef));
            button4.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));

            //---- button5 ----
            button5.setText("Go");
            button5.setBackground(new Color(0x3366ff));
            button5.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
            button5.setForeground(new Color(0xefefef));

            //---- button6 ----
            button6.setText("Go");
            button6.setBackground(new Color(0x3366ff));
            button6.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
            button6.setForeground(new Color(0xefefef));

            //---- button7 ----
            button7.setText("Go");
            button7.setBackground(new Color(0x3366ff));
            button7.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
            button7.setForeground(new Color(0xefefef));

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(panel5Layout.createParallelGroup()
                            .addComponent(button5, GroupLayout.Alignment.TRAILING)
                            .addComponent(button1, GroupLayout.Alignment.TRAILING)
                            .addComponent(button4, GroupLayout.Alignment.TRAILING)
                            .addComponent(button3, GroupLayout.Alignment.TRAILING)
                            .addComponent(button6, GroupLayout.Alignment.TRAILING)
                            .addComponent(button7, GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(button1)
                        .addGap(43, 43, 43)
                        .addComponent(button7)
                        .addGap(54, 54, 54)
                        .addComponent(button3)
                        .addGap(64, 64, 64)
                        .addComponent(button4)
                        .addGap(52, 52, 52)
                        .addComponent(button5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(button6)
                        .addContainerGap())
            );
        }
        add(panel5, new GridConstraints(2, 2, 1, 1,
            GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        add(vSpacer1, new GridConstraints(3, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK,
            GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 
    private JPanel panel1;
    private JButton button2;
    private JPanel panel2;
    private JLabel label4;
    private JPanel panel4;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JPanel panel5;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/Setting.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton6() {
        return button6;
    }
}
