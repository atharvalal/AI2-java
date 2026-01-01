package week8;

public class salarycalculation {
    private double basicsalary;
    public salarycalculation(double basicsalary){
        this.basicsalary=basicsalary;

    }
    void Display(){
        System.out.println("basic salary: "+basicsalary);
    }
    public double grosssalary(){
        double grosssalary=basicsalary+(0.20*basicsalary);
        return grosssalary;

    }
    
}
