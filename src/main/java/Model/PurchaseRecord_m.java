package Model;

import View.PurchaseRecord;

import javax.swing.*;

public class PurchaseRecord_m {
    private PurchaseRecord purchaseRecord;

    public PurchaseRecord_m(PurchaseRecord purchaseRecord) {
        this.purchaseRecord = purchaseRecord;
    }

    public void init(JFrame welcome) {
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.purchaseRecord);
        welcome.repaint();
        welcome.revalidate();
    }
}
