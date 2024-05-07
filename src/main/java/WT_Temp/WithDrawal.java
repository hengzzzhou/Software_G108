/*
 * Created by JFormDesigner on Mon May 06 20:12:28 CST 2024
 */

package WT_Temp;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;

/**
 * @author 20386
 */
public class WithDrawal extends JPanel {
    public WithDrawal() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel1 = new JPanel();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(1200, 900));
            panel1.setOpaque(false);
            panel1.setBorder(null);
            panel1.setDoubleBuffered(false);

            //---- textField1 ----
            textField1.setOpaque(false);
            textField1.setBackground(new Color(0, 0, 0, 0));
            textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));

            //---- button1 ----
            button1.setOpaque(false);
            button1.setContentAreaFilled(false);
            //---- button2 ----
            button2.setOpaque(false);
            button2.setContentAreaFilled(false);

            //---- button3 ----
            button3.setText("R");
            button3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            button3.setBackground(Color.YELLOW); // 设置背景颜色为黄色
            button3.setForeground(Color.BLACK); // 设置字体颜色为白色

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 889, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(152, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 572, Short.MAX_VALUE)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1129, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(button3)
                        .addGap(150, 150, 150)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))
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
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.repaint();
        ImageIcon image = new ImageIcon("src/main/imgs/img_10.png");
        g.drawImage(image.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
