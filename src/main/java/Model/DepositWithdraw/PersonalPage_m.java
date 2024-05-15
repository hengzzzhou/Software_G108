package Model.DepositWithdraw;

import View.DepositWithdraw.PersonalPage;

import javax.swing.*;
import Class.User;

public class PersonalPage_m {
    PersonalPage personalPage = new PersonalPage();

    public PersonalPage_m(PersonalPage personalPage) {
        this.personalPage = personalPage;
    }

    public void init(JFrame welcome, User user){
        welcome.getContentPane().removeAll();
        personalPage.getChTextField().setText(String.format("%.2f", user.getCharge()));
        personalPage.getDeTextField().setText(String.format("%.2f", user.getDemandDeposit()));
        personalPage.getTiTextField().setText(String.format("%.2f", user.getTimeDeposit()));
        welcome.getContentPane().add(this.personalPage);
        welcome.repaint();
        welcome.revalidate();
    }
}
