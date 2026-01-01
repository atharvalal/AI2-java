package week8;

import java.util.Scanner;


public class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Bank b1= new Bank(001l, 250000, "Atharva lal shrestha");
        double bal=b1.getbalance();
        System.out.println("initial balance : "+bal);

        b1.deposit(120000);
        System.out.println("After deposit : "+b1.getbalance());
        System.out.println("Enter withdraw amount : ");
        double withdrawamount= sc.nextDouble();
        if(b1.withdraw(withdrawamount)){
        
        System.out.println("The withdrawal was Successful ");
        System.out.println("Remaining balance : "+b1.getbalance());

        }else{
            System.out.println("insufficient balance");

        }
    }
    
}
