package me.sit.dev.io_object;
import java.io.Serializable;
import java.util.*;

public class Account implements Serializable {
    private String name;
    private final int id;
    private double balance;
    private String log;
    private final List<String> logs = new ArrayList<>();

    public Account(int id, String name){
        if (id < 0 || name.isBlank()) {
            throw new IllegalArgumentException("id must > 0, name mustn't empty, balance must > 0");
        }
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public int getLogsSize(){
        return logs.size();
    }
    public List<String> getLogs(){
        return logs;
    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", logs=" + logs +
                '}';
    }

    public boolean deposit(double money) {
        if (money < 0) {
            this.log = "deposit error";
            return false;
        };
        this.balance += money;
        this.log = "deposit:+" + money;
        logs.add(log);
        return true;
    }
    public boolean withdraw(double money) {
        if (money < 0 || this.balance < money) {
            this.log = "withdraw error";
            return false;
        };
        this.balance -= money;
        this.log = "withdraw:-" + money;
        logs.add(log);
        return true;
    }
    public boolean transfer(Account account, double money) {
        //! check if transfer to same account
        if (this == account || money <= 0) {
            this.log = "transfer error";
            return false;
        }
        else {
            this.balance -= money;
            account.deposit(money);
            this.log = String.format("transfer (-%.2f): to %s (+%.2f)",
                    money,account.getName(),money);
            logs.add(log);
            return true;
        }
    }
}
