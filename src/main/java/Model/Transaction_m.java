package Model;

import View.Transaction;
import Class.User;
import View.TransactionItem;

import javax.swing.*;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Transaction_m {
    public Transaction transaction;
    private User user;
    private Timer timer;

    public Transaction_m() {
        this.transaction = new Transaction();
    }

    public void init(JFrame welcome, User user) {
        this.user = user;
        loadTransactionsFromUser();
        startLogListMonitor();
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.transaction);
        welcome.repaint();
        welcome.revalidate();

        // Add a listener to the button to check if it's working
//        this.transaction.getReButton().addMouseListener(new java.awt.event.MouseAdapter() {
//            @Override
//            public void mouseClicked(java.awt.event.MouseEvent e) {
//                System.out.println("Return button clicked");
//                // Perform the action you want
//            }
//        });
    }

    private void loadTransactionsFromUser() {
        JPanel panel5 = transaction.getPanel5();
        panel5.removeAll();
        List<String> logList = user.getLogList();

        for (String logEntry : logList) {
            String[] transactionData = logEntry.split("\\|");
            if (transactionData.length == 3) {
                String date = transactionData[0];
                String type = transactionData[1];
                String amount = type.equalsIgnoreCase("withdraw") ? "-$" + transactionData[2] : "$" + transactionData[2];
                TransactionItem transactionItem = new TransactionItem(date, type, amount);
                panel5.add(transactionItem);
            }
        }

        panel5.revalidate();
        panel5.repaint();
    }

    private void startLogListMonitor() {
        if (timer != null) {
            timer.cancel();
        }
        timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> loadTransactionsFromUser());
            }
        }, 0, 5000); // Check interval can be adjusted as needed
    }
}
