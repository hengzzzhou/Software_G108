/*
 * Created by JFormDesigner on Mon May 06 21:11:43 CST 2024
 */

package WT_Temp;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 20386
 */
public class new_main extends JPanel {
    public new_main() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel1 = new JPanel();
        slider1 = new JSlider();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        scrollPane1= new JScrollPane();
        buttonA = new JButton();
        buttonB= new JButton();
        buttonC= new JButton();
        buttonPanel= new JPanel();

        // Create ImageIcon for Button A
        ImageIcon imgIcon = new ImageIcon("src/main/imgs/main_1.png");
        ImageIcon imgIcon1 = new ImageIcon("src/main/imgs/main_2.png");
        ImageIcon imgIcon2 = new ImageIcon("src/main/imgs/main_3.png");

        // Create Buttons A, B, C
        buttonA.setIcon(imgIcon);
        buttonA.setPreferredSize(new Dimension(400, 474));
        buttonA.setOpaque(false);
        buttonA.setContentAreaFilled(false);
        buttonA.setBorderPainted(false);

        buttonB.setIcon(imgIcon1);
        buttonB.setPreferredSize(new Dimension(400, 474));
        buttonB.setOpaque(false);
        buttonB.setContentAreaFilled(false);
        buttonB.setBorderPainted(false);

        buttonC.setIcon(imgIcon2);
        buttonC.setPreferredSize(new Dimension(400, 474));
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


        //======== this ========
        setPreferredSize(new Dimension(1200, 900));
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(1200, 900));
            panel1.setOpaque(false);

            //---- scrollBar1 ----
            scrollPane1.setViewportView(buttonPanel);

            scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrollPane1.setPreferredSize(new Dimension(1200, 474));
            scrollPane1.setOpaque(false);
            scrollPane1.getViewport().setOpaque(false);


            //---- button 1----
           // button1.setIcon(imgIcon);

            button1.setOpaque(false);
            button1.setContentAreaFilled(false);
            button1.setBorderPainted(false);

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




            //---- button 7----
            button7.setOpaque(false);
            button7.setContentAreaFilled(false);
            button7.setBorderPainted(false);
            //---- button6 ----
            button6.setText("R");



            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
                        .addGap(154, 154, 154))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 1249, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(slider1, GroupLayout.PREFERRED_SIZE, 805, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 608, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(slider1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
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
    private JSlider slider1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JScrollPane scrollPane1;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JPanel buttonPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/Main_page.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
}
