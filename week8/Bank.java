package week8;

public class Bank {
    private long accountNumber;
    private double balance;
    private String name;

    public Bank(long accountNumber,double balance,String name){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;


    }
    public double getbalance(){
        return this.balance;
    }
    void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
        }
    }
    boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}
