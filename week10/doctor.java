package week10;

public class doctor extends Person {
    private String specialization;
    private double consultationfee;

    public doctor(int id, String name, double salary, String specialization, double consultationfee) {
        super(id, name, salary);
        this.specialization = specialization;
        this.consultationfee = consultationfee;

    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.consultationfee;
    }

    public double calculateSalary(int emergencycase){
        return this.calculateSalary() + (emergencycase*1000);
    }
    @Override
    public String toString(){
        return super.toString()+"specialization :"+specialization+"consultationfee :"+consultationfee;
    }


}
