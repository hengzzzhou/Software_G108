package Model.DepositWithdraw;

import View.DepositWithdraw.DemandDeposit;

import javax.swing.*;
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
        double value = Double.parseDouble(demandDeposit.getTextField1().getText());
        int time = (int)Double.parseDouble(demandDeposit.getTextField1().getText());
        double accVal = user.getDemandDeposit();
        double ChaVal = user.getCharge();
        if (value <= ChaVal){
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
            log = log + timeStamp + "|" + "deposit" + "|" + String.format("%.2f", value);
            logList.add(log);
            user.setLogList(logList);
        }
        demandDeposit.getTextField1().setText("");
        return user;
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
