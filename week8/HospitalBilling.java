package week8;

public class HospitalBilling {
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;


    public HospitalBilling(String patientName, int age, int daysAdmitted, double dailyCharge) {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }


    int getDaysAdmitted() {
        return this.daysAdmitted;
    }


    void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }


    double calculateTotalBill() {
        double totalBill = daysAdmitted * dailyCharge;

        
        if (daysAdmitted > 7) {
            totalBill = totalBill - (0.10 * totalBill);
        }

        return totalBill;
    }


    void displayDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Charge: " + dailyCharge);
    }
    
}
