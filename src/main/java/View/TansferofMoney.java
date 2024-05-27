/*
 * Created by JFormDesigner on Tue May 14 15:02:35 CST 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 20386
 */
public class TansferofMoney extends JPanel {
    public TansferofMoney() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();

        //======== this ========
        setPreferredSize(new Dimension(1200, 900));
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

            //---- button2 ----
            button2.setOpaque(false);
            button2.setContentAreaFilled(false);
            button2.setBorderPainted(false);
            //---- button3 ----
            button3.setOpaque(false);
            button3.setContentAreaFilled(false);
            button3.setBorderPainted(false);

            //---- textField1 ----
            textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
            textField1.setOpaque(false);
            textField1.setBorder(null);


            //---- textField2 ----
            textField2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
            textField2.setOpaque(false);
            textField2.setBorder(null);

            //---- textField3 ----
            textField3.setOpaque(false);
            textField3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
            textField3.setOpaque(false);
            textField3.setBorder(null);


            //---- textField4 ----
            textField4.setOpaque(false);
            textField4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
            textField4.setOpaque(false);
            textField4.setBorder(null);


            //---- textField5 ----
            textField5.setOpaque(false);
            textField5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
            textField5.setOpaque(false);
            textField5.setBorder(null);


            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 504, Short.MAX_VALUE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(419, Short.MAX_VALUE)
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
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
    private JButton button2;
    private JButton button3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.repaint();
        ImageIcon image = new ImageIcon("src/main/imgs/TansferofMoney.png");
        g.drawImage(image.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }

    public JButton getButton1() {
        return button1;
    }

    public JTextField getTotalField1() {
        return textField1;
    }

    public JTextField getChangeField2() {
        return textField2;
    }

    public JTextField getTimeField3() {
        return textField3;
    }

    public JTextField getDemandField4() {
        return textField4;
    }

    public JTextField getTransferField5() {
        return textField5;
    }

    public JButton getConfirmButton2() {
        return button2;
    }

    public JButton getCancelButton3() {
        return button3;
    }
}
