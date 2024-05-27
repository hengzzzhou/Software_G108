package Model;

import View.ContactUs;

import javax.swing.*;

public class ContactUs_m {
    private ContactUs contactUs;

    public ContactUs_m(ContactUs contactUs){
        this.contactUs=contactUs;
    }
    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.contactUs);
        welcome.repaint();
        welcome.revalidate();
    }
}
