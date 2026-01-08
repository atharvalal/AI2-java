package week10.OnlineFoodDeliverySystem;

public class DeliverPartner {
    private  int partnerId;
    private String name;
    private double basePay;

    public DeliverPartner(int partnerId, String name, double basePay) {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }
    public int getPartnerId() {
        return partnerId;
    }
    public String getName() {
        return name;
    }
    public double getBasePay() {
        return basePay;
    }
    public int setPartnerId(int partnerId) {
       return this.partnerId = partnerId;
    }
    public String setName(String name) {
       return this.name = name;
    }
    public double  setBasePay(double basePay) {
         return this.basePay = basePay;
    }
    public String toString() {
        return " ID : "+partnerId + " " +"Name :  "+ name +"baseSalary : "+" " + basePay;
    }
    public  double calcSalary(){
        return this.basePay;

    }

}
