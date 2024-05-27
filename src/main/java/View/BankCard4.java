package View;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 20386
 */
public class BankCard4 extends JPanel {
    public BankCard4() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 
        panel1 = new TransparentPanel();
        scrollPane1 = new JScrollPane();
        buttonPanel = new TransparentPanel();
        button1 = new JButton();


        String path1 = "src/main/imgs/SmallBankCard1.png";
        String path2 = "src/main/imgs/SmallBankCard2.png";
        String path3 = "src/main/imgs/SmallBankCard3.png";
        String path4 = "src/main/imgs/SmallBankCard4.png";
        String path5 = "src/main/imgs/SmallBankCard5.png";
        String path6 = "src/main/imgs/SmallBankCard6.png";
        String path7 = "src/main/imgs/SmallBankCard7.png";
        String path8 = "src/main/imgs/SmallBankCard8.png";
        String path9 = "src/main/imgs/SmallBankCard9.png";


        ImageIcon icon1 = new ImageIcon(path1);
        ImageIcon icon2 = new ImageIcon(path2);
        ImageIcon icon3 = new ImageIcon(path3);
        ImageIcon icon4 = new ImageIcon(path4);
        ImageIcon icon5 = new ImageIcon(path5);
        ImageIcon icon6 = new ImageIcon(path6);
        ImageIcon icon7 = new ImageIcon(path7);
        ImageIcon icon8 = new ImageIcon(path8);
        ImageIcon icon9 = new ImageIcon(path9);

        //======== this ========
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(1200, 900));

            //---- button1 ----
            button1.setText("R");
            button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            button1.setBackground(Color.YELLOW); // 设置背景颜色为黄色
            button1.setForeground(Color.BLACK); // 设置字体颜色为白色

            // 设置按钮面板大小，使其能够容纳 3x3 的按钮
            buttonPanel.setPreferredSize(new Dimension(1200, 900));
            buttonPanel.setLayout(null);

            // 创建并添加按钮
            int buttonWidth = 400;
            int buttonHeight = 300;
            int x = 0, y = 0;
            for (int i = 1; i <= 9; i++) {
                JButton button = new JButton(String.valueOf(i));
                button.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
                button.setBounds(x, y, buttonWidth, buttonHeight);
                button.setOpaque(false);
                button.setContentAreaFilled(false);
                button.setBorderPainted(false);

                // 为第一个按钮插入第一张图片
                if (i == 1) {button.setIcon(icon1);}
                if (i == 2) {button.setIcon(icon2);}
                if (i == 3) {button.setIcon(icon3);}
                if (i == 4) {button.setIcon(icon4);}
                if (i == 5) {button.setIcon(icon5);}
                if (i == 6) {button.setIcon(icon6);}
                if (i == 7) {button.setIcon(icon7);}
                if (i == 8) {button.setIcon(icon8);}
                if (i == 9) {button.setIcon(icon9);}

                buttonPanel.add(button);

                x += buttonWidth;
                if (i % 3 == 0) {
                    x = 0;
                    y += buttonHeight;
                }
            }

            // Scroll Pane for the Button Panel
            scrollPane1.setViewportView(buttonPanel);
            scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane1.setOpaque(false);
            scrollPane1.getViewport().setOpaque(false);
            scrollPane1.setPreferredSize(new Dimension(1200, 900));

            // Panel layout
            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(button1)
                                    .addContainerGap(1095, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(button1)
                                    .addGap(77, 77, 77)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 733, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(23, Short.MAX_VALUE))
            );
        }
        add(panel1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // 自定义透明面板类
    private static class TransparentPanel extends JPanel {
        public TransparentPanel() {
            super();
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private TransparentPanel buttonPanel;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.repaint();
        ImageIcon image = new ImageIcon("src/main/imgs/img_7.png");
        g.drawImage(image.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
