/*
 * Created by JFormDesigner on Mon May 13 11:09:49 CST 2024
 */

package View;

import javax.swing.*;
import java.awt.*;

/**
 * @author 84977
 */
public class TransactionItem extends JPanel {
    public TransactionItem() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        label3 = new JLabel();

        //======== this ========
        setMaximumSize(new Dimension(780, 100));
        setPreferredSize(new Dimension(780, 100));
        setMinimumSize(new Dimension(780, 100));

        //---- label1 ----
        label1.setText("2024.3.1");

        //---- label2 ----
        label2.setText("Withdrawal");

        //---- button1 ----
        button1.setText("Check");

        //---- label3 ----
        label3.setText("-$100");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addGap(169, 169, 169)
                    .addComponent(button1)
                    .addGap(27, 27, 27)
                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(label2)
                        .addComponent(button1)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(266, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
