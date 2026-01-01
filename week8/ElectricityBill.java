package week8;

public class ElectricityBill {
    private String consumername;
    private int unitsConsumed;
    public ElectricityBill(String consumername , int unitsConsumed){
        this.consumername=consumername;
        this.unitsConsumed=unitsConsumed;

    }
    public void setunits(int unitsConsumed){
        this.unitsConsumed=unitsConsumed;

    }
    public int getunits(){
        return this.unitsConsumed;

    }
    public double calculatebill(){
        if (unitsConsumed<100){
            double totalbill = unitsConsumed*5;
            return totalbill;
        }else{
             double totalbill= (500)+((unitsConsumed-100)*8);
             return totalbill;
        }
    }
     void display(){
        System.out.println("Consumer details : ");
        System.out.println("consumer name : "+consumername);
        System.out.println("units consumed : "+unitsConsumed);

    }
}
