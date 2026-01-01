package week8;

public class bill {
    public static void main(String[] args) {
        

    ElectricityBill e1= new ElectricityBill("Atharva ", 250);
    e1.display();
    System.out.println("Your total bill will be : "+e1.calculatebill());

}

}
