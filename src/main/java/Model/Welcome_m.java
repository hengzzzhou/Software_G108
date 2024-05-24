package Model;

import View.BasicFrame;
import View.Welcome;

public class Welcome_m {
    private Welcome welcome;
    public Welcome_m(Welcome welcome){
        this.welcome=welcome;
    }

    // Refresh the welcome page
    public void refreshWelcome(BasicFrame basicFrame){
        basicFrame.getContentPane().removeAll();
        basicFrame.repaint();
        basicFrame.getContentPane().add(this.welcome);
        basicFrame.repaint();
        basicFrame.revalidate();
    }
}
