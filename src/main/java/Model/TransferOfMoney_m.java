package Model;

import View.TansferofMoney;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import Class.Parent;
import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TransferOfMoney_m {
    private TansferofMoney tansferofMoney;
    private double time;
    private double demand;
    private double total;
    private double change;

    public TransferOfMoney_m(TansferofMoney tansferofMoney){
        this.tansferofMoney=tansferofMoney;
    }
    public void init(JFrame welcome){
        welcome.getContentPane().removeAll();
        welcome.getContentPane().add(this.tansferofMoney);
        welcome.repaint();
        welcome.revalidate();
    }
    public void initMoney(Parent parent){
        File file=new File("src/main/java/Class/Accounts.jsonl");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                JSONObject account = new JSONObject(line);
                if(account.getString("parentID").equals(parent.getID())){
                    this.demand=account.getDouble("demandDeposit");
                    this.time=account.getDouble("timeDeposit");
                    this.change=account.getDouble("charge");
                    this.total=this.change+this.demand+this.time;
                    break;
                }
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        this.tansferofMoney.getDemandField4().setText(String.valueOf(this.demand));
        this.tansferofMoney.getTimeField3().setText(String.valueOf(this.time));
        this.tansferofMoney.getChangeField2().setText(String.valueOf(this.change));
        this.tansferofMoney.getTotalField1().setText(String.valueOf(this.total));
        this.tansferofMoney.getTransferField5().setText("");
    }

    public void transferMoney(Parent parent){
        if(!validTransfer()){
            this.tansferofMoney.getTransferField5().setText("");
            return;
        }
        double transfer=Double.parseDouble(this.tansferofMoney.getTransferField5().getText());
        this.total+=transfer;
        this.change+=transfer;
        this.tansferofMoney.getChangeField2().setText(String.valueOf(this.change));
        this.tansferofMoney.getTotalField1().setText(String.valueOf(this.total));
        this.tansferofMoney.getTransferField5().setText("");
        this.updateAccount(parent);
        this.dumpTransfer(parent, transfer);
    }
    public void dumpTransfer(Parent parent, double value){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStamp = df.format(System.currentTimeMillis());
        String info = timeStamp + "|" + "Transfer" + "|" + String.format("%.2f", value);
        parent.getLogList().add(info);
    }
    public boolean validTransfer(){
        if(this.tansferofMoney.getTransferField5().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a number!");
            return false;
        }
        if(!this.tansferofMoney.getTransferField5().getText().matches("^[0-9]+(.[0-9]{1,2})?$")){
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            return false;
        }
        double transfer=Double.parseDouble(this.tansferofMoney.getTransferField5().getText());
        if(transfer<=0){
            JOptionPane.showMessageDialog(null, "Please enter a valid number! (Greater than 0)");
            return false;
        }
        return true;
    }
    public void updateAccount(Parent parent){
        File file = new File("src/main/java/Class/Accounts.jsonl");
        File tempFile = new File("src/main/java/Class/Accounts_temp.jsonl");
        String line;
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // 读取所有条目到列表中
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (int i = 0; i < lines.size(); i++){
                JSONObject jsonObject = new JSONObject(lines.get(i));
                /*** 该处需要在jsonl修改时进行修改 ***/
                if (jsonObject.getString("parentID").equals(parent.getID())) {
                    jsonObject.put("charge", this.change);
                    // 保存信息
                    lines.set(i, jsonObject.toString());
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        // 写入新文件并执行替换
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            for (String jsonLine : lines) {
                writer.write(jsonLine);
                writer.newLine();
            }
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        file.delete();
        tempFile.renameTo(file);
    }
}
