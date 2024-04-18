package Model;

import View.Welcome;

public class Welcome_m {
    private Welcome welcome;
    public Welcome_m(Welcome welcome){
        this.welcome=welcome;
    }

    // Refresh the welcome page
    public void refreshWelcome(){
        this.welcome.getContentPane().removeAll();
        this.welcome.repaint();
        this.welcome.getContentPane().add(this.welcome.getPanel1());
        this.welcome.repaint();
        this.welcome.revalidate();
    }
}
