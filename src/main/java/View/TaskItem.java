/*
 * Created by JFormDesigner on Mon May 13 11:09:49 CST 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 84977
 */
public class TaskItem extends JPanel {
    public TaskItem() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setMaximumSize(new Dimension(780, 100));
        setPreferredSize(new Dimension(780, 100));
        setMinimumSize(new Dimension(780, 100));

        //---- label1 ----
        label1.setText("sweep the floor");

        //---- label2 ----
        label2.setText("Completed");

        //---- button1 ----
        button1.setText("Check");

        //---- button2 ----
        button2.setText("Delete");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addGap(159, 159, 159)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(button2)
                    .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(label2))
                    .addContainerGap(273, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
