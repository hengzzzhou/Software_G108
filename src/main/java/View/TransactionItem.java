package View;

import javax.swing.*;
import java.awt.*;

/**
 * Author: 84977
 */
public class TransactionItem extends JPanel {
    public TransactionItem(String date, String type, String amount) {
        initComponents(date, type, amount);
    }

    private void initComponents(String date, String type, String amount) {
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        setMaximumSize(new Dimension(780, 100));
        setPreferredSize(new Dimension(780, 100));
        setMinimumSize(new Dimension(780, 100));

        label1.setText(date);
        label2.setText(type);
        label3.setText(amount);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                                .addComponent(label2)
                                .addGap(169, 169, 169)
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
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(266, Short.MAX_VALUE))
        );
    }

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
}
