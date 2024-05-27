/*
 * Created by JFormDesigner on Mon May 13 21:47:40 CST 2024
 */

package View.DepositWithdraw;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 20386
 */
public class DemandDeposit extends JPanel {
    public DemandDeposit() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license -
        panel1 = new JPanel();
        button1 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(1200, 900));
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(1200, 900));
            panel1.setOpaque(false);

            //---- button1 ----
            button1.setText("R");
            button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            button1.setBackground(Color.YELLOW); // 设置背景颜色为黄色
            button1.setForeground(Color.WHITE);
            //---- textField1 ----
            textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
            textField1.setOpaque(false);
            textField1.setBorder(null);
            //---- textField2 ----
            textField2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
            textField2.setOpaque(false);
            textField2.setBorder(null);
            //---- button2 ----
            button2.setOpaque(false);
            button2.setContentAreaFilled(false);
            button2.setBorderPainted(false);
            //---- button3 ----
            button3.setOpaque(false);
            button3.setContentAreaFilled(false);
            button3.setBorderPainted(false);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 506, Short.MAX_VALUE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 337, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 704, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 684, GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(1010, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap(284, Short.MAX_VALUE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 586, Short.MAX_VALUE)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119))
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
    // Generated using JFormDesigner Open Source Project license -
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.repaint();
        ImageIcon image = new ImageIcon("src/main/imgs/DemandDeposit.png");
        g.drawImage(image.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }
    public JButton getReButton() {
        return button1;
    }
    public JButton getConfirmButton(){return button3;}
    public JButton getCancelButton(){return button2;}
    public JTextField getTextField1() {
        return textField1;
    }
    public JTextField getTextField2() {
        return textField2;
    }
}
