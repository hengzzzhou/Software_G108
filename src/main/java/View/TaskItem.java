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
        // Generated using JFormDesigner Open Source Project license - 
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setMaximumSize(new Dimension(780, 100));
        setPreferredSize(new Dimension(780, 100));
        setMinimumSize(new Dimension(780, 100));
        setFont(new Font("Eras Bold ITC", Font.BOLD, 12));

        //---- label1 ----
        label1.setText("sweep the floor");
        label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));

        //---- label2 ----
        label2.setText("Completed");
        label2.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));

        //---- button1 ----
        button1.setText("Check");
        button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));

        //---- button2 ----
        button2.setText("Delete");
        button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));

        //---- button3 ----
        button3.setText("Done");
        button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button3.setVisible(false);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(label1)
                    .addGap(108, 108, 108)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                    .addComponent(button3)
                    .addGap(18, 18, 18)
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
                        .addComponent(button3)
                        .addComponent(label2))
                    .addContainerGap(276, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JLabel getNameLabel() {
        return label1;
    }

    public JLabel getStatusLabel() {
        return label2;
    }

    public JButton getDelButton() {
        return button2;
    }

    public JButton getCheckButton() {
        return button1;
    }

    public JButton getButton3() {
        return button3;
    }
}
