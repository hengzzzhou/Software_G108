package Model;

import View.Shop;

import javax.swing.*;

public class Shop_m {
    private Shop shop;

    public Shop_m(Shop shop){
        this.shop=shop;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.shop);
        welcome.repaint();
        welcome.revalidate();
    }
}
