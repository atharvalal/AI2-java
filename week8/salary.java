package week8;

public class salary {
    public static void main(String[] args) {
        salarycalculation c1= new salarycalculation(120000);
        c1.Display();
        double finalsalary= c1.grosssalary();
        System.out.println("gross salary: "+finalsalary);

    }

    
}
