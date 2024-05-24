package View.DepositWithdraw;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Wed May 15 16:24:58 GMT+08:00 2024
 */



/**
 * @author 86166
 */
public class PersonalPage extends JPanel {
    public PersonalPage() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button7 = new JButton();
        button9 = new JButton();
        textField4 = new JTextField();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(1200, 900));
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(1200, 900));
            panel1.setOpaque(false);

            //---- button1 ----
            button1.setText("R");
            button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
            button1.setBackground(Color.YELLOW); // 设置背景颜色为黄色
            button1.setForeground(Color.BLACK); // 设置字体颜色为白色


            button2.setOpaque(false);
            button2.setContentAreaFilled(false);
            button2.setBorderPainted(false);

            button3.setOpaque(false);
            button3.setContentAreaFilled(false);
            button3.setBorderPainted(false);

            button4.setOpaque(false);
            button4.setContentAreaFilled(false);
            button4.setBorderPainted(false);

            button5.setOpaque(false);
            button5.setContentAreaFilled(false);
            button5.setBorderPainted(false);


            //---- textField1 ----
            textField1.setOpaque(false);
            textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
            textField1.setBorder(null);
            //---- textField2 ----
            textField2.setOpaque(false);
            textField2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
            textField2.setBorder(null);
            //---- button7 ----
            button7.setOpaque(false);
            button7.setContentAreaFilled(false);
            button7.setBorderPainted(false);

            //---- button9 ----
            button9.setOpaque(false);
            button9.setContentAreaFilled(false);
            button9.setBorderPainted(false);

            //---- textField4 ----
            textField4.setOpaque(false);
            textField4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
            textField4.setBorder(null);

            //---- button11 ----
            button11.setOpaque(false);
            button11.setContentAreaFilled(false);
            button11.setBorderPainted(false);


            //---- button12 ----
            button12.setOpaque(false);
            button12.setContentAreaFilled(false);
            button12.setBorderPainted(false);

            //---- button13 ----
            button13.setOpaque(false);
            button13.setContentAreaFilled(false);
            button13.setBorderPainted(false);


            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                                    .addGap(109, 109, 109)
                                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(147, 147, 147)
                                                    .addComponent(button3)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                                    .addComponent(button5)
                                                    .addGap(146, 146, 146)
                                                    .addComponent(button4)
                                                    .addGap(139, 139, 139))
                                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                                    .addGap(95, 95, 95)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(84, 84, 84)
                                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(button11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(button12, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 608, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(button13, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                                            .addComponent(button9, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                                            .addComponent(button7, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                                    .addGap(22, 22, 22))
                                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                                    .addGap(49, 49, 49)
                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 1028, Short.MAX_VALUE)))
                                    .addGap(33, 33, 33))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(button1)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(165, 165, 165))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(146, 146, 146)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(20, 20, 20)))
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                                    .addGap(75, 75, 75)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(button12, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(61, 61, 61)
                                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(button11, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(button9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(button13, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(113, Short.MAX_VALUE))
            );
        }
        add(panel1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button7;
    private JButton button9;
    private JTextField textField4;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/0cfec932eee769019b18e6cce2a037a.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getReButton(){return button1; }
    public JButton getTDButton() {
        return button12;

    }
    public JButton getTWButton() {
        return button9;


    }
    public JButton getDDButton() {
        return button11;
    }

    public JButton getDWButton() {
        return button13;


    }
    public JButton getCWButton() {
        return button7;

    }
    public JTextField getChTextField(){return textField1;}
    public JTextField getTiTextField(){return textField2;}
    public JTextField getDeTextField(){return textField4;}
    public JButton getTransactionButton() {
        return button4;
    }

}
