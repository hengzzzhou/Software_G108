package Model.DepositWithdraw;

import View.DepositWithdraw.TimeDeposit2;

import javax.swing.*;
import java.text.SimpleDateFormat;
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
        if(!checkInput()){
            return user;
        }
        double value = Double.parseDouble(timeDeposit2.getTextField1().getText());
        double accVal = user.getTimeDeposit();
        double ChaVal = user.getCharge();
        if (!checkValidDeposit(user, value)){
            return user;
        }
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        accVal = accVal - value;
        ChaVal = ChaVal + value;

        // 更新user金额
        user.setTimeDeposit(accVal);
        user.setCharge(ChaVal);

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        timeStamp = df.format(System.currentTimeMillis());
        log = log + timeStamp + "|" + "TimeWithdraw" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);

        timeDeposit2.getTextField1().setText("");
        return user;
    }
    public boolean checkValidDeposit(Child user, double value){
        if(value <= 0){
            JOptionPane.showMessageDialog(null, "Invalid value");
            timeDeposit2.getTextField1().setText("");
            return false;
        }
        if(value > user.getTimeDeposit()){
            JOptionPane.showMessageDialog(null, "Insufficient balance");
            timeDeposit2.getTextField1().setText("");
            return false;
        }
        return true;
    }
    public boolean checkInput(){
        if(timeDeposit2.getTextField1().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the amount");
            return false;
        }
        if(!timeDeposit2.getTextField1().getText().matches("^[0-9]+(.[0-9]{1,2})?$")){
            JOptionPane.showMessageDialog(null, "Invalid input");
            return false;
        }
        return true;
    }
    public void cancelButton(){
        timeDeposit2.getTextField1().setText("");
    }
}
