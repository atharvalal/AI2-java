package week10;

public class HospitalApp {
    public static void main(String[] args) {
        doctor d1 = new doctor(1,"Atharva",250000,"ortho",12000);
        System.out.println(d1);
        System.out.println("Final salary Without Emergency Cases : " + d1.calculateSalary());
        System.out.println("With emergency cases : "+d1.calculateSalary(50));
        nurse n= new nurse(1,"Sita",25000,"9pm-3am",10000);
        System.out.println(n);
        System.out.println("with extra allowance Final Salary: "+n.calculateSalary());

    }
}
