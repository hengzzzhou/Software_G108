package Model;

public class User {
    private String ID;
    private String name;
    private double balance;

    private int progress;
    public User(String ID, String name){
        this.ID=ID;
        this.name=name;
        this.balance=0;
        this.progress=18;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transfer(double amount){
        this.balance+=amount;
    }

    public int getProgress() {
        return progress;
    }

}
