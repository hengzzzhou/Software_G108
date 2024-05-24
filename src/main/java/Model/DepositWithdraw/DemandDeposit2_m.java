package Model.DepositWithdraw;

import View.DepositWithdraw.DemandDeposit2;
import Class.User;

import javax.swing.*;
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
        double value = Double.parseDouble(demandDeposit2.getTextField1().getText());
        double accVal = user.getDemandDeposit();
        // 此处对于输入进行运算 (以下内容须在不同页面修改加减号)
        accVal = accVal - value;

        // 更新user金额
        user.setDemandDeposit(accVal);

        // 更新user的log
        String log = "";
        List<String> logList = user.getLogList();
        String timeStamp = user.getDepositTime();
        log = log + timeStamp + "|" + "Withdraw" + "|" + String.format("%.2f", value);
        logList.add(log);
        user.setLogList(logList);
        demandDeposit2.getTextField1().setText("");
        return user;
    }
    public void cancelButton(){
        demandDeposit2.getTextField1().setText("");
    }
}
