package Model;

import View.ShoppingTrolley;

import javax.swing.*;

public class ShoppingTrolley_m {
    private ShoppingTrolley shoppingTrolley;

    public ShoppingTrolley_m(ShoppingTrolley shoppingTrolley) {
        this.shoppingTrolley = shoppingTrolley;
    }
    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.shoppingTrolley);
        welcome.repaint();
        welcome.revalidate();
    }
}
