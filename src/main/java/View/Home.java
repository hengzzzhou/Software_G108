/*
 * Created by JFormDesigner on Wed May 08 00:59:54 CST 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 84977
 */
public class Home extends JPanel {
    public Home() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel1 = new JPanel();
        button1 = new JButton();
        panel7 = new JPanel();
        label6 = new JLabel();
        panel2 = new JPanel();
        panel5 = new JPanel();
        label1 = new JLabel();
        panel6 = new JPanel();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        panel3 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        panel4 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();

        //======== this ========
        setOpaque(false);
        setLayout(new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setOpaque(false);

            //---- button1 ----
            button1.setText("R");
            button1.setPreferredSize(new Dimension(35, 35));
            button1.setMaximumSize(new Dimension(76, 35));
            button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
            button1.setBackground(new Color(0xc1ffcc00, true));
            button1.setForeground(new Color(0x999999));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
            );
        }
        add(panel1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel7 ========
        {
            panel7.setPreferredSize(new Dimension(190, 105));
            panel7.setOpaque(false);

            //---- label6 ----
            label6.setText("HOME");
            label6.setHorizontalAlignment(SwingConstants.CENTER);
            label6.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
            label6.setForeground(new Color(0xefefef));

            GroupLayout panel7Layout = new GroupLayout(panel7);
            panel7.setLayout(panel7Layout);
            panel7Layout.setHorizontalGroup(
                panel7Layout.createParallelGroup()
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))
            );
            panel7Layout.setVerticalGroup(
                panel7Layout.createParallelGroup()
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
            );
        }
        add(panel7, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setOpaque(false);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
            );
        }
        add(panel2, new GridConstraints(0, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel5 ========
        {
            panel5.setPreferredSize(new Dimension(200, 200));
            panel5.setOpaque(false);

            //---- label1 ----
            label1.setText("text");
            label1.setOpaque(true);
            label1.setPreferredSize(new Dimension(200, 200));

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addComponent(label1, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
            );
        }
        add(panel5, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel6 ========
        {
            panel6.setPreferredSize(new Dimension(600, 100));
            panel6.setMinimumSize(new Dimension(415, 78));
            panel6.setOpaque(false);

            //---- button6 ----
            button6.setText("<html><div align=\"center\">Loan<br>Administration<div></html>");
            button6.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
            button6.setBackground(new Color(0x9fffcc00, true));
            button6.setForeground(new Color(0xefefef));

            //---- button7 ----
            button7.setText("<html><div align=\"center\">Bank Card<br>Management<div></html>");
            button7.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
            button7.setBackground(new Color(0xb7ffcc33, true));
            button7.setForeground(new Color(0xefefef));

            //---- button8 ----
            button8.setText("Bill");
            button8.setBackground(new Color(0xa8ffcc00, true));
            button8.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
            button8.setForeground(new Color(0xefefef));

            GroupLayout panel6Layout = new GroupLayout(panel6);
            panel6.setLayout(panel6Layout);
            panel6Layout.setHorizontalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
            );
            panel6Layout.setVerticalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel6Layout.createParallelGroup()
                            .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                            .addComponent(button8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
            );
        }
        add(panel6, new GridConstraints(1, 1, 1, 2,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel3 ========
        {
            panel3.setPreferredSize(new Dimension(200, 270));
            panel3.setOpaque(false);

            //---- button2 ----
            button2.setText("Change the avatar");
            button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
            button2.setBackground(new Color(0x0099ff));
            button2.setForeground(new Color(0xefefef));

            //---- button3 ----
            button3.setText("Deposit");
            button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
            button3.setBackground(new Color(0x0099ff));
            button3.setForeground(new Color(0xefefef));

            //---- button4 ----
            button4.setText("Withdrawal");
            button4.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
            button4.setBackground(new Color(0x3399ff));
            button4.setForeground(new Color(0xefefef));

            //---- button5 ----
            button5.setText("Invite friends");
            button5.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
            button5.setBackground(new Color(0x0099ff));
            button5.setForeground(new Color(0xefefef));

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2)
                        .addGap(20, 20, 20))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(button3)
                        .addGap(34, 34, 34)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
            );
        }
        add(panel3, new GridConstraints(3, 0, 1, 1,
            GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel4 ========
        {
            panel4.setPreferredSize(new Dimension(400, 200));
            panel4.setOpaque(false);

            //---- label2 ----
            label2.setText("My Assets");
            label2.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
            label2.setForeground(new Color(0xefefef));

            //---- label3 ----
            label3.setText("$100");
            label3.setOpaque(true);
            label3.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));

            //---- label4 ----
            label4.setText("Monthly Income & Expenditure");
            label4.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
            label4.setForeground(new Color(0xefefef));

            //---- label5 ----
            label5.setText("+10 / -5");
            label5.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
            label5.setOpaque(true);

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(135, 135, 135))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
            );
        }
        add(panel4, new GridConstraints(3, 1, 1, 2,
            GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        ImageIcon imageIcon = new ImageIcon("src/main/imgs/homeAvatar.jpg");
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(180, 200, Image.SCALE_DEFAULT));
        label1.setIcon(imageIcon);
        label1.setSize(200, 200);
        label1.setOpaque(true);
        label1.setPreferredSize(new Dimension(200, 200));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JPanel panel1;
    private JButton button1;
    private JPanel panel7;
    private JLabel label6;
    private JPanel panel2;
    private JPanel panel5;
    private JLabel label1;
    private JPanel panel6;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel panel3;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel panel4;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/Setting.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }
}
