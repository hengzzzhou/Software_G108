package Model.DepositWithdraw;

import View.DepositWithdraw.DemandDeposit2;
import View.DepositWithdraw.TimeDeposit;

import javax.swing.*;
import java.util.List;
import Class.User;

public class TimeDeposit_m {
    TimeDeposit timeDeposit = new TimeDeposit();

    public TimeDeposit_m(TimeDeposit timeDeposit) {
        this.timeDeposit = timeDeposit;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.timeDeposit);
        welcome.repaint();
        welcome.revalidate();
    }
    public User confirmButton(User user){
        double value = Double.parseDouble(timeDeposit.getTextField1().getText());
        double accVal = user.getTimeDeposit();
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        accVal = accVal + value;

        // 更新user金额
        user.setTimeDeposit(accVal);

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        log = log + timeStamp + "|" + "deposit" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);
        timeDeposit.getTextField1().setText("");
        return user;
    }
    public void cancelButton(){
        timeDeposit.getTextField1().setText("");
    }
}
