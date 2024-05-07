package Model;

import View.WithDrawal;

import javax.swing.*;

public class Withdrawal_m {
    WithDrawal withDrawal = new WithDrawal();

    public Withdrawal_m(WithDrawal withDrawal) {
        this.withDrawal = withDrawal;
    }

    public void init(JFrame welcome) {
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.withDrawal);
        welcome.repaint();
        welcome.revalidate();
    }
}
