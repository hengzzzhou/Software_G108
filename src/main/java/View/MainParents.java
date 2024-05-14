/*
 * Created by JFormDesigner on Mon May 13 10:42:04 CST 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 84977
 */
public class MainParents extends JPanel {
    public MainParents() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel2 = new JPanel();
        button1 = new JButton();
        panel6 = new JPanel();
        panel4 = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        button2 = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        panel3 = new JPanel();
        panel5 = new JPanel();

        //======== this ========
        setLayout(new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel2 ========
        {
            panel2.setOpaque(false);

            //---- button1 ----
            button1.setText("R");
            button1.setPreferredSize(new Dimension(35, 35));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
            );
        }
        add(panel2, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel6 ========
        {
            panel6.setOpaque(false);

            GroupLayout panel6Layout = new GroupLayout(panel6);
            panel6.setLayout(panel6Layout);
            panel6Layout.setHorizontalGroup(
                panel6Layout.createParallelGroup()
                    .addGap(0, 78, Short.MAX_VALUE)
            );
            panel6Layout.setVerticalGroup(
                panel6Layout.createParallelGroup()
                    .addGap(0, 83, Short.MAX_VALUE)
            );
        }
        add(panel6, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel4 ========
        {
            panel4.setOpaque(false);

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
            );
        }
        add(panel4, new GridConstraints(0, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(800, 500));
            panel1.setOpaque(false);
            panel1.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));

            //---- label1 ----
            label1.setText("Transaction Record");
            label1.setForeground(new Color(0xefefef));
            label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 22));

            //---- button2 ----
            button2.setText("GO");
            button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));

            //---- label2 ----
            label2.setText("Task");
            label2.setFont(new Font("Eras Bold ITC", Font.BOLD, 22));
            label2.setForeground(new Color(0xefefef));

            //---- label3 ----
            label3.setText("Transfer");
            label3.setFont(new Font("Eras Bold ITC", Font.BOLD, 22));
            label3.setForeground(new Color(0xefefef));

            //---- button3 ----
            button3.setText("GO");
            button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));

            //---- button4 ----
            button4.setText("GO");
            button4.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                        .addComponent(button2))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(button4))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                        .addComponent(button3))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(label2)
                                .addGap(145, 145, 145)
                                .addComponent(label3))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button3)))
                        .addGap(107, 176, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(button4))
                        .addContainerGap())
            );
        }
        add(panel1, new GridConstraints(2, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel3 ========
        {
            panel3.setOpaque(false);

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGap(0, 86, Short.MAX_VALUE)
            );
        }
        add(panel3, new GridConstraints(3, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel5 ========
        {
            panel5.setOpaque(false);

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addGap(0, 86, Short.MAX_VALUE)
            );
        }
        add(panel5, new GridConstraints(3, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JPanel panel2;
    private JButton button1;
    private JPanel panel6;
    private JPanel panel4;
    private JPanel panel1;
    private JLabel label1;
    private JButton button2;
    private JLabel label2;
    private JLabel label3;
    private JButton button3;
    private JButton button4;
    private JPanel panel3;
    private JPanel panel5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/welcome_dark.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
}
