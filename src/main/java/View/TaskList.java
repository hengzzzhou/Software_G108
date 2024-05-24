/*
 * Created by JFormDesigner on Mon May 13 11:03:26 CST 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
import org.jdesktop.swingx.*;

/**
 * @author 84977
 */
public class TaskList extends JPanel {
    public TaskList() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel1 = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        panel5 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel2 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(800, 600));
            panel1.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            panel1.setOpaque(false);
            panel1.setMinimumSize(new Dimension(555, 500));

            //---- label1 ----
            label1.setText("Task List");
            label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 28));
            label1.setForeground(new Color(0xefefef));

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
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label2)
                        .addGap(287, 287, 287)
                        .addComponent(label3)
                        .addContainerGap(423, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(0, 671, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(label3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE))
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

            //---- button1 ----
            button1.setText("Return");
            button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            button1.setBackground(new Color(0x0099ff));

            //---- button2 ----
            button2.setText("ADD");
            button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
            button2.setBackground(new Color(0x0099ff));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(button1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 532, Short.MAX_VALUE)
                        .addComponent(button2)
                        .addGap(60, 60, 60))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2))
                        .addContainerGap(44, Short.MAX_VALUE))
            );
        }
        add(panel2, new GridConstraints(2, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

//        for(int i=0;i<10;i++){
//            TaskItem taskItem = new TaskItem();
//            panel5.add(taskItem);
//        }

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JPanel panel1;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JPanel panel5;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/welcome_dark.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
    public JPanel getListPanel() {
        return panel5;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }
}
