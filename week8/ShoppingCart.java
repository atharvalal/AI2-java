package week8;

public class ShoppingCart {
    private String itemName;
    private int itemPrice;
    private int quantity;

    public ShoppingCart(String itemName,int itemPrice,int quantity){
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;

    }
    public  void setquantity(int quantity){
        this.quantity=quantity;
    }
    public int  getquantity(){
        return this.quantity;

    }
    public void Display(){
        System.out.println("Your Items Details Will be : ");
        System.out.println("itemName: "+itemName);
        System.out.println("itemPrice : "+itemPrice);
        System.out.println("Quantity: "+quantity);

    }
    public double calculatetotal(){
        double total = itemPrice*quantity;
        return total;
    }
    public double calculatediscountedtotal(double discountPercent){
        double calculatediscountedtotal=calculatetotal()-((discountPercent/100)*calculatetotal());
                return calculatediscountedtotal;

    }
}

