package Model.DepositWithdraw;

import View.DepositWithdraw.WithDrawal;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.List;
import Class.User;
import Class.Child;

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

    public Child confirmButton(Child user){
        if (!checkInput()){
            return user;
        }
        double value = Double.parseDouble(withDrawal.getTextField1().getText());
        double accVal = user.getCharge();
        if(!checkValidWithdrawal(user, value)){
            return user;
        }
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        accVal = accVal - value;

        // 更新user金额
        user.setCharge(accVal);

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        timeStamp = df.format(System.currentTimeMillis());
        log = log + timeStamp + "|" + "ChangeWithdraw" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);
        withDrawal.getTextField1().setText("");
        return user;
    }

    public boolean checkValidWithdrawal(Child user, double value){
        if(value <= 0){
            JOptionPane.showMessageDialog(null, "Invalid value");
            withDrawal.getTextField1().setText("");
            return false;
        }
        if(value > user.getCharge()){
            JOptionPane.showMessageDialog(null, "Insufficient balance");
            withDrawal.getTextField1().setText("");
            return false;
        }
        return true;
    }
    public boolean checkInput(){
        if(withDrawal.getTextField1().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the amount");
            return false;
        }
        if(!withDrawal.getTextField1().getText().matches("^[0-9]+(.[0-9]{1,2})?$")){
            JOptionPane.showMessageDialog(null, "Invalid input");
            withDrawal.getTextField1().setText("");
            return false;
        }
        return true;
    }
    public void cancelButton(){
        withDrawal.getTextField1().setText("");
    }
}
