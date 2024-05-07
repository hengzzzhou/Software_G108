/*
 * Created by JFormDesigner on Thu Apr 18 17:41:38 CST 2024
 */

package View;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        scrollPane1 = new JScrollPane();
        panel6 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        progressBar1 = new JProgressBar();
        label7 = new JLabel();
        button5 = new JButton();
        panel10 = new JPanel();
        button6 = new JButton();
        panel13 = new JPanel();
        label6 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        buttonA = new JButton();
        buttonB= new JButton();
        buttonC= new JButton();
        buttonPanel= new JPanel();


        int width = 500,height = 474;
        // Create ImageIcon for Button A
        ImageIcon imgIcon = new ImageIcon("src/main/imgs/main_1.png");
        ImageIcon imgIcon1 = new ImageIcon("src/main/imgs/main_2.png");
        ImageIcon imgIcon2 = new ImageIcon("src/main/imgs/main_3.png");
        imgIcon2.setImage(imgIcon2.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT ));
        imgIcon.setImage(imgIcon.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT ));
        imgIcon1.setImage(imgIcon1.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT ));

        // Create Buttons A, B, C
        buttonA.setIcon(imgIcon);
        buttonA.setPreferredSize(new Dimension(50, 74));
        buttonA.setOpaque(false);
        buttonA.setContentAreaFilled(false);
        buttonA.setBorderPainted(false);

        buttonB.setIcon(imgIcon1);
        buttonB.setPreferredSize(new Dimension(40, 74));
        buttonB.setOpaque(false);
        buttonB.setContentAreaFilled(false);
        buttonB.setBorderPainted(false);

        buttonC.setIcon(imgIcon2);
        buttonC.setPreferredSize(new Dimension(400, 474));
        buttonC.setOpaque(false);
        buttonC.setContentAreaFilled(false);
        buttonC.setBorderPainted(false);


        // 设置每个按钮的固定大小
        Dimension buttonSize = new Dimension(500, 474);
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

        //======== this ========
        setLayout(new GridLayoutManager(5, 4, new Insets(0, 0, 0, 0), -1, -1, true, true));

        //======== scrollPane1 ========
        {
            scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        }
        add(scrollPane1, new GridConstraints(0, 0, 2, 4,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel6 ========
        {
            panel6.setOpaque(false);
            panel6.setForeground(new Color(0xefefef));

            GroupLayout panel6Layout = new GroupLayout(panel6);
            panel6.setLayout(panel6Layout);
            panel6Layout.setHorizontalGroup(
                panel6Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
            panel6Layout.setVerticalGroup(
                panel6Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
        }
        add(panel6, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel8 ========
        {
            panel8.setOpaque(false);
            panel8.setForeground(new Color(0xefefef));

            GroupLayout panel8Layout = new GroupLayout(panel8);
            panel8.setLayout(panel8Layout);
            panel8Layout.setHorizontalGroup(
                panel8Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
            panel8Layout.setVerticalGroup(
                panel8Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
        }
        add(panel8, new GridConstraints(1, 2, 1, 1,
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
        add(panel9, new GridConstraints(2, 0, 1, 4,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel10 ========
        {
            panel10.setOpaque(false);

            //---- button6 ----
            button6.setText("message");
            button6.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
            button6.setBackground(new Color(0x6effff00, true));
            button6.setForeground(Color.black);

            GroupLayout panel10Layout = new GroupLayout(panel10);
            panel10.setLayout(panel10Layout);
            panel10Layout.setHorizontalGroup(
                panel10Layout.createParallelGroup()
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button6, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel10Layout.setVerticalGroup(
                panel10Layout.createParallelGroup()
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
            );
        }
        add(panel10, new GridConstraints(3, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel13 ========
        {
            panel13.setOpaque(false);

            //---- label6 ----
            label6.setText("<html>Mom: i paid u for doing <br>the dishes.</html>");
            label6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 22));
            label6.setForeground(new Color(0xefefef));

            GroupLayout panel13Layout = new GroupLayout(panel13);
            panel13.setLayout(panel13Layout);
            panel13Layout.setHorizontalGroup(
                panel13Layout.createParallelGroup()
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(58, Short.MAX_VALUE))
            );
            panel13Layout.setVerticalGroup(
                panel13Layout.createParallelGroup()
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))
            );
        }
        add(panel13, new GridConstraints(3, 1, 1, 1,
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
    private JScrollPane scrollPane1;
    private JPanel panel6;
    private JPanel panel8;
    private JPanel panel9;
    private JProgressBar progressBar1;
    private JLabel label7;
    private JButton button5;
    private JPanel panel10;
    private JButton button6;
    private JPanel panel13;
    private JLabel label6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JPanel buttonPanel;
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

    public JButton getButtonA() {
        return buttonA;
    }

    public JButton getButtonB() {
        return buttonB;
    }

    public JButton getButtonC() {
        return buttonC;
    }

    public JButton getButton2() {
        return button2;
    }
}
