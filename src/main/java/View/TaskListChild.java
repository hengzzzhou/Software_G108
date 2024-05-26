/*
 * Created by JFormDesigner on Mon May 20 18:14:53 CST 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import com.intellij.uiDesigner.core.*;
import org.jdesktop.swingx.*;

/**
 * @author 84977
 */
public class TaskListChild extends JPanel {
    public TaskListChild() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 
        panel3 = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();
        panel4 = new JPanel();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        panel5 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel2 = new JPanel();

        //======== this ========
        setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel3 ========
        {
            panel3.setPreferredSize(new Dimension(50, 50));
            panel3.setMinimumSize(new Dimension(50, 50));
            panel3.setOpaque(false);

            //---- button1 ----
            button1.setText("R");
            button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            button1.setBackground(new Color(0x0099ff));
            button1.setMaximumSize(new Dimension(50, 50));
            button1.setPreferredSize(new Dimension(35, 35));

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
        }
        add(panel3, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_SOUTHEAST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label1 ----
        label1.setText("Task List");
        label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 28));
        label1.setForeground(new Color(0xefefef));
        add(label1, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel4 ========
        {
            panel4.setPreferredSize(new Dimension(50, 50));
            panel4.setOpaque(false);

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
            );
        }
        add(panel4, new GridConstraints(0, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(800, 600));
            panel1.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            panel1.setOpaque(false);
            panel1.setMinimumSize(new Dimension(555, 500));

            //======== scrollPane1 ========
            {
                scrollPane1.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));

                //======== panel5 ========
                {
                    panel5.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
                    panel5.setOpaque(false);
                    panel5.setLayout(new VerticalLayout());
                }
                scrollPane1.setViewportView(panel5);
            }

            //---- label2 ----
            label2.setText("Item");
            label2.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            label2.setForeground(new Color(0xefefef));

            //---- label3 ----
            label3.setText("Status");
            label3.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            label3.setForeground(new Color(0xefefef));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(288, 288, 288)
                                .addComponent(label3)
                                .addGap(0, 301, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(label3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
            );
        }
        add(panel1, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(800, 100));
            panel2.setOpaque(false);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGap(0, 685, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGap(0, 47, Short.MAX_VALUE)
            );
        }
        add(panel2, new GridConstraints(2, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 
    private JPanel panel3;
    private JButton button1;
    private JLabel label1;
    private JPanel panel4;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JPanel panel5;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public JButton getButton1() {
        return button1;
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/welcome_dark.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JPanel getListPanel() {
        return panel5;
    }
}
