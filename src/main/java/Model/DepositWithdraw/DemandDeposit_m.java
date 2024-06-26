package Model.DepositWithdraw;

import View.DepositWithdraw.DemandDeposit;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.List;
import Class.User;
import Class.Child;

public class DemandDeposit_m {
    DemandDeposit demandDeposit = new DemandDeposit();

    public DemandDeposit_m(DemandDeposit demandDeposit) {
        this.demandDeposit = demandDeposit;
    }

    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.demandDeposit);
        welcome.repaint();
        welcome.revalidate();
    }
    public Child confirmButton(Child user){
        if (!checkInput()){
            return user;
        }
        double value = Double.parseDouble(demandDeposit.getTextField1().getText());
        int time = (int)Double.parseDouble(demandDeposit.getTextField1().getText());
        double accVal = user.getDemandDeposit();
        double ChaVal = user.getCharge();
        if(!checkValidDeposit(user, value)){
            return user;
        }
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        accVal = accVal + value;
        ChaVal = ChaVal - value;

        // 更新user金额
        user.setDemandDeposit(accVal);
        user.setCharge(ChaVal);

        if (time != 0){
            user.setTimeRate(get_time_rate(time));
        }

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        timeStamp = df.format(System.currentTimeMillis());
        log = log + timeStamp + "|" + "DemandDeposit" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);

        demandDeposit.getTextField1().setText("");
        return user;
    }
    public boolean checkValidDeposit(Child user, double value){
        if(value <= 0){
            JOptionPane.showMessageDialog(null, "Invalid value");
            demandDeposit.getTextField1().setText("");
            return false;
        }
        if(value > user.getCharge()){
            JOptionPane.showMessageDialog(null, "Insufficient balance");
            demandDeposit.getTextField1().setText("");
            return false;
        }
        return true;
    }
    public boolean checkInput(){
        if(demandDeposit.getTextField1().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Invalid input");
            return false;
        }
        if(!demandDeposit.getTextField1().getText().matches("^[0-9]+(.[0-9]{1,2})?$")){
            JOptionPane.showMessageDialog(null, "Invalid input");
            return false;
        }
        return true;
    }
    public void cancelButton(){
        demandDeposit.getTextField1().setText("");
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
