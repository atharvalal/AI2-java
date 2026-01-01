package week8;

public class HospitalTest {
    public static void main(String[] args) {


        HospitalBilling p1 = new HospitalBilling("Ram", 30, 5, 2000);


        HospitalBilling p2 = new HospitalBilling("Sita", 45, 10, 2500);

        System.out.println("----- Patient 1 -----");
        p1.displayDetails();
        System.out.println("Total Bill: " + p1.calculateTotalBill());


        System.out.println("\n----- Patient 2 -----");
        p2.displayDetails();
        System.out.println("Total Bill: " + p2.calculateTotalBill());
    }
    
}
