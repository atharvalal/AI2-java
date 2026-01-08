package week10.OnlineFoodDeliverySystem;

public class BikeDelivery extends DeliverPartner{
    private double bonus;
    public BikeDelivery(int PartnerId,String name,double basePay,double bonus){
        super(PartnerId,name,basePay);
        this.bonus = bonus;

    }

    @Override
    public double calcSalary() {
        return super.calcSalary()+bonus;
    }

    @Override
    public String toString() {
        return super.toString()+" bonus : "+bonus;
    }
}
