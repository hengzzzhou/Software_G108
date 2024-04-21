/*
 * Created by JFormDesigner on Sun Apr 21 00:27:29 CST 2024
 */

package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import net.miginfocom.swing.*;

/**
 * @author 84977
 */
public class Welcome extends JPanel {
    public Welcome() {
        initComponents();
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
        panel2 = new JPanel();
        hSpacer4 = new JPanel(null);
        panel3 = new JPanel();
        button3 = new JButton();
        label1 = new JLabel();
        hSpacer2 = new JPanel(null);
        button1 = new JButton();
        hSpacer1 = new JPanel(null);
        button2 = new JButton();
        hSpacer3 = new JPanel(null);
        vSpacer1 = new JPanel(null);

        //======== this ========
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //======== panel2 ========
        {
            panel2.setOpaque(false);

            //---- hSpacer4 ----
            hSpacer4.setMinimumSize(new Dimension(35, 35));
            hSpacer4.setPreferredSize(new Dimension(35, 35));
            hSpacer4.setOpaque(false);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hSpacer4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addComponent(hSpacer4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
            );
        }
        add(panel2, "cell 2 1");

        //======== panel3 ========
        {
            panel3.setOpaque(false);

            //---- button3 ----
            button3.setText("?");
            button3.setMinimumSize(new Dimension(45, 45));
            button3.setMaximumSize(new Dimension(60, 60));
            button3.setPreferredSize(new Dimension(35, 35));
            button3.setFont(new Font("Eras Bold ITC", Font.BOLD, 17));
            button3.setBackground(new Color(0xbdffcc00, true));
            button3.setForeground(new Color(0xefefef));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
            );
        }
        add(panel3, "cell 10 1");

        //---- label1 ----
        label1.setText("Welcome to the Children's Virtual Bank");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Eras Bold ITC", Font.BOLD, 48));
        label1.setForeground(new Color(0xefefef));
        label1.setBackground(new Color(0xcccccc));
        add(label1, "cell 6 3,dock center");

        //---- hSpacer2 ----
        hSpacer2.setOpaque(false);
        add(hSpacer2, "cell 6 5");

        //---- button1 ----
        button1.setText("Log In");
        button1.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        button1.setBackground(new Color(0x6ce824));
        button1.setForeground(new Color(0xefefef));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
                button1MouseClicked(e);
            }
        });
        add(button1, "cell 6 5,wmax 120");

        //---- hSpacer1 ----
        hSpacer1.setOpaque(false);
        add(hSpacer1, "cell 6 5");

        //---- button2 ----
        button2.setText("Sign Up");
        button2.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        button2.setBackground(new Color(0x6ce824));
        button2.setForeground(new Color(0xefefef));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        add(button2, "cell 6 5,wmax 120");

        //---- hSpacer3 ----
        hSpacer3.setOpaque(false);
        add(hSpacer3, "cell 6 5");

        //---- vSpacer1 ----
        vSpacer1.setOpaque(false);
        add(vSpacer1, "cell 6 6,hmin 70");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Open Source Project license - 淘宝星河飘雪
    private JPanel panel2;
    private JPanel hSpacer4;
    private JPanel panel3;
    private JButton button3;
    private JLabel label1;
    private JPanel hSpacer2;
    private JButton button1;
    private JPanel hSpacer1;
    private JButton button2;
    private JPanel hSpacer3;
    private JPanel vSpacer1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/welcome_dark.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }
}
