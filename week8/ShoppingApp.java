package week8;

public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart s1= new ShoppingCart("Bread", 1000, 5);
        s1.Display();
        System.out.println("Your total amount will be : "+s1.calculatetotal());
        System.out.println("As there is a festive offer Your discounted amount will be : "+s1.calculatediscountedtotal(20));
        
    }
    
}
