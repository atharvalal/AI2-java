package week10;

public class nurse extends Person {
    private String shift;
    private double extraAllowance;

    public nurse(int id,String name,double salary,  String shift, double extraAllowance) {
        super(id,name,salary);
        this.shift = shift;
        this.extraAllowance = extraAllowance;

    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+extraAllowance;
    }

    public String toString(){
        return super.toString()+" shift:"+shift+" extraAllowance:"+extraAllowance;
    }


}
