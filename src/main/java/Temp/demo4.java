/*
 * Created by JFormDesigner on Thu May 02 14:29:41 CST 2024
 */

package Temp;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author 20386
 */
public class demo4 extends JPanel {


    public demo4() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel1 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        button3 = new JButton();
        label4 = new JLabel();
        imageLabel = new JLabel();
        buttonA = new JButton();

        ImageIcon imgIcon1 = new ImageIcon("src/main/imgs/img_1.png");


        //======== this ========
        setPreferredSize(new Dimension(1200, 900));
        setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(1200, 900));
            panel1.setOpaque(false);
            //======== panel2 ========
            {
                panel2.setPreferredSize(new Dimension(600, 900));
                panel2.setOpaque(false);
                //======== buttonA ========
                buttonA.setIcon(imgIcon1);
                buttonA.setPreferredSize(new Dimension(400, 474));
                buttonA.setOpaque(false);
                buttonA.setContentAreaFilled(false);
                buttonA.setBorderPainted(false);
                Dimension buttonSize = new Dimension(600, 474);
                buttonA.setPreferredSize(buttonSize);
                panel2.add(buttonA);
                //---- button1 ----
                button1.setText("Delete");
                button1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));

                //---- button2 ----
                button2.setText("R");
                button2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup()
                                                .addGroup(panel2Layout.createSequentialGroup()
                                                        .addGap(62, 62, 62)
                                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panel2Layout.createSequentialGroup()
                                                        .addGap(38, 38, 38)
                                                        .addComponent(button2)))
                                        .addContainerGap(400, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(button2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 667, Short.MAX_VALUE)
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115))
                );
            }

            //---- label2 ----
            label2.setText("Saving Amount ");
            label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));

            //---- label3 ----
            label3.setText("Donation Amount");
            label3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));

            //---- button3 ----
            button3.setText("Confirm");
            button3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));



            //---- label4 ----
            label4.setText("<html> </html>");
            label4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addGap(89, 89, 89)
                                                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addGap(91, 91, 91)
                                                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)))
                                                    .addContainerGap(252, Short.MAX_VALUE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                                    .addGroup(panel1Layout.createParallelGroup()
                                                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(63, 63, 63))
                                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(196, 196, 196))
                                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(44, 44, 44))))))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(158, 158, 158)
                                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(49, 49, 49)
                                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(87, 87, 87)
                                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private JPanel panel2;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JButton button3;
    private JLabel label4;
    private JLabel imageLabel;
    private JButton buttonA;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/img_8.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);}

}
