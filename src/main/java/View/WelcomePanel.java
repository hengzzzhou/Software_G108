package View;

import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends JPanel {
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.repaint();
        ImageIcon image =new ImageIcon("src/main/imgs/welcome.png");
        g.drawImage(image.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
}
