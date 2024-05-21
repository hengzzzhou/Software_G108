/*
 * Created by JFormDesigner on Tue May 21 08:40:23 CST 2024
 */

package WT_Temp;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import com.intellij.uiDesigner.core.*;
import javax.swing.JButton;
/**
 * @author 20386
 */
public class new_main_1 extends JPanel {
    public new_main_1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel1 = new JPanel();
        scrollBar1 = new JScrollBar();
        button1 = new JButton();
        progressBar1 = new JProgressBar();
        textField1 = new JTextField();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        buttonA = new JButton();
        buttonB= new JButton();
        buttonC= new JButton();
        buttonPanel= new JPanel();
        scrollPane1= new JScrollPane();

        // Create ImageIcon for Button A
        ImageIcon imgIcon = new ImageIcon("src/main/imgs/mainpage1.png");
        ImageIcon imgIcon1 = new ImageIcon("src/main/imgs/mainpage2.png");
        ImageIcon imgIcon2 = new ImageIcon("src/main/imgs/mainpage3.png");

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
        setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(1200, 900));
            panel1.setOpaque(false);

            //---- scrollBar1 ----
            scrollBar1.setOrientation(Adjustable.HORIZONTAL);

            scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            scrollPane1.setPreferredSize(new Dimension(1200, 474));
            scrollPane1.setOpaque(false);
            scrollPane1.getViewport().setOpaque(false);




            //---- textField1 ----
            textField1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 30));
            textField1.setOpaque(false);

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

            //---- button6 ----
            button6.setText("R");


            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()

                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 829, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()

                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 1418, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()

                                .addGap(36, 36, 36)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(button3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(0, 441, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
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
    private JScrollBar scrollBar1;
    private JButton button1;
    private JProgressBar progressBar1;
    private JTextField textField1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JPanel buttonPanel;
    private JScrollPane scrollPane1;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        //ImageIcon image = new ImageIcon("src/main/imgs/welcome_dark.png");
        ImageIcon image =new ImageIcon("src/main/imgs/NewMainPage.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
}
