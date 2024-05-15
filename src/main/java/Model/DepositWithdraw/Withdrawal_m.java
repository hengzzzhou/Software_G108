package Model.DepositWithdraw;

import View.DepositWithdraw.WithDrawal;

import javax.swing.*;
import java.util.List;
import Class.User;

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

    public User confirmButton(User user){
        double value = Double.parseDouble(withDrawal.getTextField1().getText());
        double accVal = user.getCharge();
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        accVal = accVal - value;

        // 更新user金额
        user.setCharge(accVal);

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        log = log + timeStamp + "|" + "Withdraw" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);
        withDrawal.getTextField1().setText("");
        return user;
    }
    public void cancelButton(){
        withDrawal.getTextField1().setText("");
    }
}
