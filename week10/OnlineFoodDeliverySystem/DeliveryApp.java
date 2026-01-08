package week10.OnlineFoodDeliverySystem;

public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery b= new BikeDelivery(1,"atharva",12000,1200);
        System.out.println(b);
        System.out.println("Final Salary : "+b.calcSalary());
        CarDelivery c= new CarDelivery(1,"Alex",25000,12000);
        System.out.println(c);
        System.out.println("Final Salary : "+c.calcSalary());

    }
}
