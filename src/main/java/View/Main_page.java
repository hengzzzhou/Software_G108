/*
 * Created by JFormDesigner on Thu Apr 18 17:41:38 CST 2024
 */

package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import com.intellij.uiDesigner.core.*;

/**
 * @author 84977
 */
public class Main_page extends JPanel {
    public Main_page() {
        initComponents();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel5 = new JPanel();
        label1 = new JLabel();
        panel6 = new JPanel();
        label2 = new JLabel();
        panel8 = new JPanel();
        label3 = new JLabel();
        panel7 = new JPanel();
        label4 = new JLabel();
        panel9 = new JPanel();
        progressBar1 = new JProgressBar();
        label7 = new JLabel();
        button5 = new JButton();
        panel10 = new JPanel();
        button6 = new JButton();
        panel13 = new JPanel();
        label6 = new JLabel();
        panel1 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setLayout(new GridLayoutManager(5, 4, new Insets(0, 0, 0, 0), -1, -1, true, true));

        //======== panel5 ========
        {
            panel5.setOpaque(false);
            panel5.setForeground(new Color(0xefefef));

            //---- label1 ----
            label1.setText("saving task");
            label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            label1.setForeground(new Color(0xff3333));

            GroupLayout panel5Layout = new GroupLayout(panel5);
            panel5.setLayout(panel5Layout);
            panel5Layout.setHorizontalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(label1)
                        .addGap(17, 17, 17))
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(label1)
                        .addContainerGap())
            );
        }
        add(panel5, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel6 ========
        {
            panel6.setOpaque(false);
            panel6.setForeground(new Color(0xefefef));

            //---- label2 ----
            label2.setText("daily task");
            label2.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            label2.setForeground(new Color(0xff0033));

            GroupLayout panel6Layout = new GroupLayout(panel6);
            panel6.setLayout(panel6Layout);
            panel6Layout.setHorizontalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(label2)
                        .addGap(15, 15, 15))
            );
            panel6Layout.setVerticalGroup(
                panel6Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(label2)
                        .addContainerGap())
            );
        }
        add(panel6, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel8 ========
        {
            panel8.setOpaque(false);
            panel8.setForeground(new Color(0xefefef));

            //---- label3 ----
            label3.setText("text");
            label3.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            label3.setForeground(new Color(0xff0033));

            GroupLayout panel8Layout = new GroupLayout(panel8);
            panel8.setLayout(panel8Layout);
            panel8Layout.setHorizontalGroup(
                panel8Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addComponent(label3)
                        .addContainerGap())
            );
            panel8Layout.setVerticalGroup(
                panel8Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(label3)
                        .addContainerGap())
            );
        }
        add(panel8, new GridConstraints(0, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel7 ========
        {
            panel7.setOpaque(false);
            panel7.setForeground(new Color(0xefefef));

            //---- label4 ----
            label4.setText("text");
            label4.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            label4.setForeground(new Color(0xff0033));

            GroupLayout panel7Layout = new GroupLayout(panel7);
            panel7.setLayout(panel7Layout);
            panel7Layout.setHorizontalGroup(
                panel7Layout.createParallelGroup()
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(label4)
                        .addContainerGap(40, Short.MAX_VALUE))
            );
            panel7Layout.setVerticalGroup(
                panel7Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(label4)
                        .addContainerGap())
            );
        }
        add(panel7, new GridConstraints(0, 3, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel9 ========
        {
            panel9.setOpaque(false);

            //---- progressBar1 ----
            progressBar1.setPreferredSize(new Dimension(176, 12));
            progressBar1.setMaximumSize(new Dimension(32767, 12));
            progressBar1.setStringPainted(true);

            //---- label7 ----
            label7.setText("goal progress");
            label7.setFont(new Font("Eras Bold ITC", Font.BOLD, 22));
            label7.setForeground(new Color(0xefefef));

            //---- button5 ----
            button5.setText("check my target");
            button5.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
            button5.setBackground(new Color(0xafff9933, true));
            button5.setForeground(Color.black);

            GroupLayout panel9Layout = new GroupLayout(panel9);
            panel9.setLayout(panel9Layout);
            panel9Layout.setHorizontalGroup(
                panel9Layout.createParallelGroup()
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel9Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                                .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 755, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(GroupLayout.Alignment.TRAILING, panel9Layout.createSequentialGroup()
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addGap(297, 297, 297))))
            );
            panel9Layout.setVerticalGroup(
                panel9Layout.createParallelGroup()
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
        }
        add(panel9, new GridConstraints(1, 0, 1, 4,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel10 ========
        {
            panel10.setOpaque(false);

            //---- button6 ----
            button6.setText("message");

            GroupLayout panel10Layout = new GroupLayout(panel10);
            panel10.setLayout(panel10Layout);
            panel10Layout.setHorizontalGroup(
                panel10Layout.createParallelGroup()
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button6)
                        .addContainerGap(18, Short.MAX_VALUE))
            );
            panel10Layout.setVerticalGroup(
                panel10Layout.createParallelGroup()
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button6)
                        .addContainerGap(54, Short.MAX_VALUE))
            );
        }
        add(panel10, new GridConstraints(2, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel13 ========
        {
            panel13.setOpaque(false);

            //---- label6 ----
            label6.setText("Mom: i paid u for doing the dishes.");

            GroupLayout panel13Layout = new GroupLayout(panel13);
            panel13.setLayout(panel13Layout);
            panel13Layout.setHorizontalGroup(
                panel13Layout.createParallelGroup()
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label6)
                        .addContainerGap(61, Short.MAX_VALUE))
            );
            panel13Layout.setVerticalGroup(
                panel13Layout.createParallelGroup()
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label6)
                        .addContainerGap(64, Short.MAX_VALUE))
            );
        }
        add(panel13, new GridConstraints(2, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel1 ========
        {

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
            );
        }
        add(panel1, new GridConstraints(3, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel3 ========
        {

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
        }
        add(panel3, new GridConstraints(3, 2, 1, 1,
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
                    .addGap(0, 92, Short.MAX_VALUE)
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGap(0, 46, Short.MAX_VALUE)
            );
        }
        add(panel4, new GridConstraints(3, 3, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button1 ----
        button1.setText("shop");
        button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        button1.setBackground(new Color(0xb5ffff00, true));
        button1.setMaximumSize(new Dimension(159, 50));
        button1.setPreferredSize(new Dimension(100, 43));
        add(button1, new GridConstraints(4, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button2 ----
        button2.setText("home");
        button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        button2.setBackground(new Color(0xdfffcc00, true));
        button2.setMaximumSize(new Dimension(100, 43));
        button2.setPreferredSize(new Dimension(100, 43));
        add(button2, new GridConstraints(4, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button3 ----
        button3.setText("setting");
        button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        button3.setBackground(new Color(0xd30099ff, true));
        button3.setMaximumSize(new Dimension(100, 43));
        button3.setPreferredSize(new Dimension(100, 43));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        add(button3, new GridConstraints(4, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button4 ----
        button4.setText("investment");
        button4.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        button4.setBackground(new Color(0xc6339900, true));
        button4.setPreferredSize(new Dimension(100, 43));
        add(button4, new GridConstraints(4, 3, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JPanel panel5;
    private JLabel label1;
    private JPanel panel6;
    private JLabel label2;
    private JPanel panel8;
    private JLabel label3;
    private JPanel panel7;
    private JLabel label4;
    private JPanel panel9;
    private JProgressBar progressBar1;
    private JLabel label7;
    private JButton button5;
    private JPanel panel10;
    private JButton button6;
    private JPanel panel13;
    private JLabel label6;
    private JPanel panel1;
    private JPanel panel3;
    private JPanel panel4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/welcome_dark.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getButton3() {
        return button3;
    }

    public JProgressBar getProgressBar1() {
        return progressBar1;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton1() {
        return button1;
    }
}
