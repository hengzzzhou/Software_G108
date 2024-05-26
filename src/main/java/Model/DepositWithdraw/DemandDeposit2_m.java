package Model.DepositWithdraw;

import View.DepositWithdraw.DemandDeposit2;
import Class.User;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.List;
import Class.Child;

public class DemandDeposit2_m {
    DemandDeposit2 demandDeposit2 = new DemandDeposit2();

    public DemandDeposit2_m(DemandDeposit2 demandDeposit2) {
        this.demandDeposit2 = demandDeposit2;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.demandDeposit2);
        welcome.repaint();
        welcome.revalidate();
    }

    public Child confirmButton(Child user){
        if(!checkInput()){
            return user;
        }
        double value = Double.parseDouble(demandDeposit2.getTextField1().getText());
        double DemVal = user.getDemandDeposit();
        double ChaVal = user.getCharge();
        if (!checkValidDeposit(user, value)){
            return user;
        }
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        DemVal = DemVal - value;
        ChaVal = ChaVal + value;

        // 更新user金额
        user.setDemandDeposit(DemVal);
        user.setCharge(ChaVal);

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        timeStamp = df.format(System.currentTimeMillis());
        log = log + timeStamp + "|" + "DemandWithdraw" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);

        demandDeposit2.getTextField1().setText("");
        return user;
    }
    public boolean checkValidDeposit(Child user, double value){
        if(value <= 0){
            JOptionPane.showMessageDialog(null, "Invalid value");
            demandDeposit2.getTextField1().setText("");
            return false;
        }
        if(value > user.getDemandDeposit()){
            JOptionPane.showMessageDialog(null, "Insufficient balance");
            demandDeposit2.getTextField1().setText("");
            return false;
        }
        return true;
    }
    public boolean checkInput(){
        if(demandDeposit2.getTextField1().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the amount");
            return false;
        }
        if(!demandDeposit2.getTextField1().getText().matches("^[0-9]+(.[0-9]{1,2})?$")){
            JOptionPane.showMessageDialog(null, "Invalid input");
            return false;
        }
        return true;
    }
    public void cancelButton(){
        demandDeposit2.getTextField1().setText("");
    }
}
