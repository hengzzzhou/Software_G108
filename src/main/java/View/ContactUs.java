/*
 * Created by JFormDesigner on Thu May 02 15:38:11 CST 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

/**
 * @author HengZ
 */
public class ContactUs extends JPanel {
    public ContactUs() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 
        panel1 = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();
        panel3 = new JPanel();
        panel2 = new JPanel();
        textField1 = new JTextField();
        panel4 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        panel5 = new JPanel();

        //======== this ========
        setLayout(new GridLayoutManager(6, 7, new Insets(0, 0, 0, 0), -1, -1, true, true));

        //======== panel1 ========
        {
            panel1.setOpaque(false);

            //---- button1 ----
            button1.setText("R");
            button1.setBackground(new Color(0xc0ffcc00, true));
            button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
            button1.setForeground(new Color(0xefefef));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(11, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(button1)
                        .addGap(0, 45, Short.MAX_VALUE))
            );
        }
        add(panel1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label1 ----
        label1.setText("Contact Us");
        label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
        label1.setForeground(new Color(0xefefef));
        add(label1, new GridConstraints(0, 3, 1, 1,
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
                    .addGap(0, 25, Short.MAX_VALUE)
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGap(0, 56, Short.MAX_VALUE)
            );
        }
        add(panel3, new GridConstraints(0, 4, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setOpaque(false);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
            );
        }
        add(panel2, new GridConstraints(0, 6, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- textField1 ----
        textField1.setText("test");
        textField1.setColumns(6);
        add(textField1, new GridConstraints(1, 1, 4, 5,
            GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_BOTH,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, new Dimension(10, 10), null, -1));

        //======== panel4 ========
        {
            panel4.setOpaque(false);

            //---- button2 ----
            button2.setText("Reset");

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2)
                        .addContainerGap())
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(button2)
                        .addContainerGap(22, Short.MAX_VALUE))
            );
        }
        add(panel4, new GridConstraints(5, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button3 ----
        button3.setText("Submit");
        add(button3, new GridConstraints(5, 5, 1, 1,
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
                    .addGap(0, 12, Short.MAX_VALUE)
            );
            panel5Layout.setVerticalGroup(
                panel5Layout.createParallelGroup()
                    .addGap(0, 45, Short.MAX_VALUE)
            );
        }
        add(panel5, new GridConstraints(5, 6, 1, 1,
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
    private JLabel label1;
    private JPanel panel3;
    private JPanel panel2;
    private JTextField textField1;
    private JPanel panel4;
    private JButton button2;
    private JButton button3;
    private JPanel panel5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/Setting.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getButton1(){
        return this.button1;
    }
}
