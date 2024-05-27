package View;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 20386
 */
public class BankCard6 extends JPanel {
    public BankCard6() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 
        panel1 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        button2 = new JButton();
        buttonA = new JButton();
        buttonB = new JButton();
        buttonC = new JButton();
        buttonPanel = new JPanel();

        //======== this ========
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setOpaque(false);
            panel1.setPreferredSize(new Dimension(1200, 900));

            //---- label1 ----
            label1.setText("<html></html>");
            label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 28));

            //---- button1 ----


            button1.setText("Bank Card List");
            button1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 28));
            button1.setForeground(Color.WHITE);
            button1.setOpaque(false);
            button1.setContentAreaFilled(false);
            button1.setBorderPainted(false);


            //---- button2 ----
            button2.setText("R");
            button2.setBackground(Color.YELLOW); // 设置背景颜色为黄色
            button2.setForeground(Color.BLACK); // 设置字体颜色为白色


            // Create ImageIcon for Button A
            ImageIcon imgIcon = new ImageIcon("src/main/imgs/BankCard3.png");
            ImageIcon imgIcon1 = new ImageIcon("src/main/imgs/BankCard1.png");
            ImageIcon imgIcon2 = new ImageIcon("src/main/imgs/BankCard4.png");

            // Create Buttons A, B, C
            buttonA.setIcon(imgIcon);
            buttonA.setPreferredSize(new Dimension(600, 474));
            buttonA.setOpaque(false);
            buttonA.setContentAreaFilled(false);
            buttonA.setBorderPainted(false);

            buttonB.setIcon(imgIcon1);
            buttonB.setPreferredSize(new Dimension(600, 474));
            buttonB.setOpaque(false);
            buttonB.setContentAreaFilled(false);
            buttonB.setBorderPainted(false);

            buttonC.setIcon(imgIcon2);
            buttonC.setPreferredSize(new Dimension(600, 474));
            buttonC.setOpaque(false);
            buttonC.setContentAreaFilled(false);
            buttonC.setBorderPainted(false);


            // 设置每个按钮的固定大小
            Dimension buttonSize = new Dimension(600, 474);
            buttonA.setPreferredSize(buttonSize);
            buttonB.setPreferredSize(buttonSize);
            buttonC.setPreferredSize(buttonSize);

            // Button Panel
            buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
            buttonPanel.add(buttonA);
            buttonPanel.add(buttonB);
            buttonPanel.add(buttonC);

            // Scroll Pane for the Button Panel
            scrollPane1.setViewportView(buttonPanel);

            scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrollPane1.setPreferredSize(new Dimension(1200, 474));
            scrollPane1.setOpaque(false);
            scrollPane1.getViewport().setOpaque(false);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(button2)
                                    .addContainerGap(1088, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1175, Short.MAX_VALUE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(83, 83, 83)
                                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(19, 19, 19))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(button2)
                                    .addGap(46, 46, 46)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addGap(70, 70, 70))
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
    private JLabel label1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JButton button2;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JPanel buttonPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    this.repaint();
    ImageIcon image =new ImageIcon("src/main/imgs/img_5.png");
    g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
}
}
