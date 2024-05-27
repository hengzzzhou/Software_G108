package Model.DepositWithdraw;

import View.DepositWithdraw.DemandDeposit2;
import View.DepositWithdraw.TimeDeposit;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;

import Class.User;
import Class.Child;

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
    public Child confirmButton(Child user){
        if(!checkInput()){
            return user;
        }
        double value = Double.parseDouble(timeDeposit.getTextField1().getText());
        double accVal = user.getTimeDeposit();
        double ChaVal = user.getCharge();

        int time = 12;
        if (!Objects.equals(timeDeposit.getTextTime().getText(), "")){
            time = (int)Double.parseDouble(timeDeposit.getTextTime().getText());
        }

        if (time != 0){
            user.setTimeRate(get_time_rate(time));
        }

        if (!checkValidDeposit(user, value)){
            return user;
        }
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        accVal = accVal + value;
        ChaVal = ChaVal - value;

        // 更新user金额
        user.setTimeDeposit(accVal);
        user.setCharge(ChaVal);

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        timeStamp = df.format(System.currentTimeMillis());
        log = log + timeStamp + "|" + "TimeDeposit" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);

        timeDeposit.getTextField1().setText("");
        timeDeposit.getTextTime().setText("");
        return user;
    }
    public boolean checkValidDeposit(Child user, double value){
        if(value <= 50){
            JOptionPane.showMessageDialog(null, "Invalid value");
            timeDeposit.getTextField1().setText("");
            return false;
        }
        if(value > user.getCharge()){
            JOptionPane.showMessageDialog(null, "Insufficient balance");
            timeDeposit.getTextField1().setText("");
            return false;
        }
        return true;
    }
    public boolean checkInput(){
        if(timeDeposit.getTextField1().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the amount");
            return false;
        }
        if(!timeDeposit.getTextField1().getText().matches("^[0-9]+(.[0-9]{1,2})?$")){
            JOptionPane.showMessageDialog(null, "Invalid input");
            return false;
        }
        return true;
    }
    public void cancelButton(){
        timeDeposit.getTextField1().setText("");
        timeDeposit.getTextTime().setText("");
    }

    private double get_time_rate(int month){
        if (month < 6){
            return 0.04;
        } else if (month < 12) {
            return 0.05;
        } else {
            return 0.06;
        }
    }
}
