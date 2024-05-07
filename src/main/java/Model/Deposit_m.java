package Model;

import View.Deposit;

import javax.swing.*;

public class Deposit_m {
    Deposit deposit = new Deposit();

    public Deposit_m(Deposit deposit) {
        this.deposit = deposit;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.deposit);
        welcome.repaint();
        welcome.revalidate();
    }
}
