package Model.DepositWithdraw;

import View.DepositWithdraw.DemandDeposit2;
import Class.User;

import javax.swing.*;
import java.util.List;

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

    public User confirmButton(User user){
        double value = Double.parseDouble(demandDeposit2.getTextField1().getText());
        double DemVal = user.getDemandDeposit();
        double ChaVal = user.getCharge();
        if (value <= DemVal){
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
            log = log + timeStamp + "|" + "Withdraw" + "|" + String.format("%.2f", value);
            logList.add(log);
            user.setLogList(logList);
        }
        demandDeposit2.getTextField1().setText("");
        return user;
    }
    public void cancelButton(){
        demandDeposit2.getTextField1().setText("");
    }
}
