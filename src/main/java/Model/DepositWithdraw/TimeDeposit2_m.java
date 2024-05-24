package Model.DepositWithdraw;

import View.DepositWithdraw.TimeDeposit2;

import javax.swing.*;
import java.util.List;
import Class.User;
import Class.Child;

public class TimeDeposit2_m {
    TimeDeposit2 timeDeposit2 = new TimeDeposit2();

    public TimeDeposit2_m(TimeDeposit2 timeDeposit2) {
        this.timeDeposit2 = timeDeposit2;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.timeDeposit2);
        welcome.repaint();
        welcome.revalidate();
    }
    public Child confirmButton(Child user){
        double value = Double.parseDouble(timeDeposit2.getTextField1().getText());
        double accVal = user.getTimeDeposit();
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        accVal = accVal - value;

        // 更新user金额
        user.setTimeDeposit(accVal);

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        log = log + timeStamp + "|" + "withdraw" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);
        timeDeposit2.getTextField1().setText("");
        return user;
    }
    public void cancelButton(){
        timeDeposit2.getTextField1().setText("");
    }
}
