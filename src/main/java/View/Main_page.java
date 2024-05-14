//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package View;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Main_page extends JPanel {
    private JScrollPane scrollPane1;
    private JPanel panel6;
    private JPanel panel8;
    private JPanel panel9;
    private JProgressBar progressBar1;
    private JLabel label7;
    private JButton button5;
    private JPanel panel10;
    private JButton button6;
    private JPanel panel13;
    private JLabel label6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JPanel buttonPanel;
    private JLabel label8;
    private JLabel label9;

    public Main_page() {
        this.initComponents();
    }

    private void button3MouseClicked(MouseEvent e) {
    }

    private void initComponents() {
        this.scrollPane1 = new JScrollPane();
        this.panel6 = new JPanel();
        this.panel8 = new JPanel();
        this.panel9 = new JPanel();
        this.progressBar1 = new JProgressBar();
        this.label7 = new JLabel();
        this.label8 = new JLabel();
        this.label9 = new JLabel();
        this.button5 = new JButton();
        this.panel10 = new JPanel();
        this.button6 = new JButton();
        this.panel13 = new JPanel();
        this.label6 = new JLabel();
        this.button1 = new JButton();
        this.button2 = new JButton();
        this.button3 = new JButton();
        this.button4 = new JButton();
        this.buttonA = new JButton();
        this.buttonB = new JButton();
        this.buttonC = new JButton();
        this.buttonPanel = new JPanel();

        int width = 500;
        int height = 474;
        ImageIcon imgIcon = new ImageIcon("src/main/imgs/main_1.png");
        ImageIcon imgIcon1 = new ImageIcon("src/main/imgs/main_2.png");
        ImageIcon imgIcon2 = new ImageIcon("src/main/imgs/main_3.png");
        imgIcon2.setImage(imgIcon2.getImage().getScaledInstance(width, height, 1));
        imgIcon.setImage(imgIcon.getImage().getScaledInstance(width, height, 1));
        imgIcon1.setImage(imgIcon1.getImage().getScaledInstance(width, height, 1));
        this.buttonA.setIcon(imgIcon);
        this.buttonA.setPreferredSize(new Dimension(50, 74));
        this.buttonA.setOpaque(false);
        this.buttonA.setContentAreaFilled(false);
        this.buttonA.setBorderPainted(false);
        this.buttonB.setIcon(imgIcon1);
        this.buttonB.setPreferredSize(new Dimension(40, 74));
        this.buttonB.setOpaque(false);
        this.buttonB.setContentAreaFilled(false);
        this.buttonB.setBorderPainted(false);
        this.buttonC.setIcon(imgIcon2);
        this.buttonC.setPreferredSize(new Dimension(400, 474));
        this.buttonC.setOpaque(false);
        this.buttonC.setContentAreaFilled(false);
        this.buttonC.setBorderPainted(false);
        Dimension buttonSize = new Dimension(500, 474);
        this.buttonA.setPreferredSize(buttonSize);
        this.buttonB.setPreferredSize(buttonSize);
        this.buttonC.setPreferredSize(buttonSize);
        this.buttonPanel.setLayout(new FlowLayout(0, 5, 5));
        this.buttonPanel.add(this.buttonA);
        this.buttonPanel.add(this.buttonB);
        this.buttonPanel.add(this.buttonC);
        this.scrollPane1.setViewportView(this.buttonPanel);
        this.scrollPane1.setHorizontalScrollBarPolicy(32);
        this.scrollPane1.setVerticalScrollBarPolicy(21);
        this.scrollPane1.setPreferredSize(new Dimension(1200, 474));
        this.scrollPane1.setOpaque(false);
        this.scrollPane1.getViewport().setOpaque(false);
        this.setLayout(new GridLayoutManager(5, 4, new Insets(0, 0, 0, 0), -1, -1, true, true));
        this.scrollPane1.setHorizontalScrollBarPolicy(32);
        this.add(this.scrollPane1, new GridConstraints(0, 0, 2, 4, 0, 3, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.panel6.setOpaque(false);
        this.panel6.setForeground(new Color(15724527));
        GroupLayout panel13Layout = new GroupLayout(this.panel6);
        this.panel6.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(panel13Layout.createParallelGroup().addGap(0, 0, 32767));
        panel13Layout.setVerticalGroup(panel13Layout.createParallelGroup().addGap(0, 0, 32767));
        this.add(this.panel6, new GridConstraints(1, 1, 1, 1, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.panel8.setOpaque(false);
        this.panel8.setForeground(new Color(15724527));
        panel13Layout = new GroupLayout(this.panel8);
        this.panel8.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(panel13Layout.createParallelGroup().addGap(0, 0, 32767));
        panel13Layout.setVerticalGroup(panel13Layout.createParallelGroup().addGap(0, 0, 32767));
        this.add(this.panel8, new GridConstraints(1, 2, 1, 1, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.panel9.setOpaque(false);
        this.progressBar1.setPreferredSize(new Dimension(176, 12));
        this.progressBar1.setMaximumSize(new Dimension(32767, 12));
        this.progressBar1.setStringPainted(true);
        this.label7.setText("goal progress");
        this.label7.setFont(new Font("Eras Bold ITC", 1, 22));
        this.label7.setForeground(new Color(15724527));
        this.button5.setText("Edit");
        this.button5.setFont(new Font("Eras Bold ITC", 1, 16));
        this.button5.setBackground(new Color(-1342203597, true));
        this.button5.setForeground(Color.black);
        panel13Layout = new GroupLayout(this.panel9);
        this.panel9.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(panel13Layout.createParallelGroup().addGroup(panel13Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(panel13Layout.createParallelGroup().addGroup(Alignment.TRAILING, panel13Layout.createSequentialGroup().addComponent(this.progressBar1, -2, 755, -2).addContainerGap()).addGroup(Alignment.TRAILING, panel13Layout.createSequentialGroup().addComponent(this.label7, -2, 171, -2).addGap(110, 110, 110).addComponent(this.button5, -2, 180, -2).addGap(297, 297, 297)))));
        panel13Layout.setVerticalGroup(panel13Layout.createParallelGroup().addGroup(panel13Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.progressBar1, -2, 12, -2).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(panel13Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.label7, -2, 32, -2).addComponent(this.button5, -1, -1, 32767)).addContainerGap()));
        this.add(this.panel9, new GridConstraints(2, 0, 1, 4, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.panel10.setOpaque(false);
        this.label8.setText("Total Assests:");
        this.label8.setFont(new Font("Eras Bold ITC", 1, 48));
        this.label8.setForeground(new Color(15724527));
        this.label8.setBackground(new Color(1862270720, true));
        this.label8.setOpaque(true); // JLabel is not opaque by default
        this.label8.setForeground(Color.black);
        panel13Layout = new GroupLayout(this.panel10);
        this.panel10.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(panel13Layout.createParallelGroup().addGroup(panel13Layout.createSequentialGroup().addContainerGap().addComponent(this.label8, -1, 121, 32767).addContainerGap()));
        panel13Layout.setVerticalGroup(panel13Layout.createParallelGroup().addGroup(panel13Layout.createSequentialGroup().addContainerGap().addComponent(this.label8, -2, 42, -2).addContainerGap(41, 32767)));
        this.add(this.panel10, new GridConstraints(3, 0, 1, 1, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.panel13.setOpaque(false);
        this.label6.setText("<html>$1000000</html>");
        this.label6.setFont(new Font("Microsoft YaHei UI", 5, 48));
        this.label6.setForeground(new Color(15724527));
        panel13Layout = new GroupLayout(this.panel13);
        this.panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(panel13Layout.createParallelGroup().addGroup(panel13Layout.createSequentialGroup().addContainerGap().addComponent(this.label6, -2, -1, -2).addContainerGap(58, 32767)));
        panel13Layout.setVerticalGroup(panel13Layout.createParallelGroup().addGroup(panel13Layout.createSequentialGroup().addContainerGap().addComponent(this.label6, -2, -1, -2).addContainerGap(64, 32767)));
        this.add(this.panel13, new GridConstraints(3, 1, 1, 1, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.button1.setText("shop");
        this.button1.setFont(new Font("Eras Bold ITC", 1, 18));
        this.button1.setBackground(new Color(-1241514240, true));
        this.button1.setMaximumSize(new Dimension(159, 50));
        this.button1.setPreferredSize(new Dimension(100, 43));
        this.add(this.button1, new GridConstraints(4, 0, 1, 1, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.button2.setText("home");
        this.button2.setFont(new Font("Eras Bold ITC", 1, 16));
        this.button2.setBackground(new Color(-536884224, true));
        this.button2.setMaximumSize(new Dimension(100, 43));
        this.button2.setPreferredSize(new Dimension(100, 43));
        this.add(this.button2, new GridConstraints(4, 1, 1, 1, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.button3.setText("setting");
        this.button3.setFont(new Font("Eras Bold ITC", 1, 16));
        this.button3.setBackground(new Color(-754935297, true));
        this.button3.setMaximumSize(new Dimension(100, 43));
        this.button3.setPreferredSize(new Dimension(100, 43));
        this.button3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Main_page.this.button3MouseClicked(e);
            }
        });
        this.add(this.button3, new GridConstraints(4, 2, 1, 1, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
        this.button4.setText("investment");
        this.button4.setFont(new Font("Eras Bold ITC", 1, 16));
        this.button4.setBackground(new Color(-969697024, true));
        this.button4.setPreferredSize(new Dimension(100, 43));
        this.add(this.button4, new GridConstraints(4, 3, 1, 1, 0, 0, 3, 3, (Dimension)null, (Dimension)null, (Dimension)null));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.repaint();
        ImageIcon image = new ImageIcon("src/main/imgs/welcome_dark.png");
        g.drawImage(image.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }

    public JButton getButton3() {
        return this.button3;
    }

    public JProgressBar getProgressBar1() {
        return this.progressBar1;
    }

    public JButton getButton5() {
        return this.button5;
    }

    public JButton getButton1() {
        return this.button1;
    }

    public JButton getButtonA() {
        return this.buttonA;
    }

    public JButton getButtonB() {
        return this.buttonB;
    }

    public JButton getButtonC() {
        return this.buttonC;
    }

    public JButton getButton2() {
        return this.button2;
    }
}
