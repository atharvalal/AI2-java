import java.util.Scanner;
public class AusadiPasal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter required medicines with quantity as a 'Pharmacist' ");
        System.out.println("Name : ");
        String medicine_name = sc.nextLine();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("'As per your request You have asked for "+quantity+" of "+medicine_name+"'");
        int cost = 150*quantity;
        System.out.println("The Stocks we have right now is: \n Quantity we have : 15 \n The Price per tablet is:150 \n Therefore Your cost will be="+cost+"\n You Can sell medicine in terms of price per tablet for : 190");
        System.out.println("Enter The Name of Medicine required as a 'Customer' : ");
        System.out.println("Name : ");
        String medicine_name2 = sc.nextLine();
        System.out.println("Quantity: ");
        int quantity2 = sc.nextInt();
        System.out.println("'As per your request You have asked for "+quantity2+" of "+medicine_name2+"'");
        int sell = 190*quantity2;
        System.out.println("The Stocks we have right now is: \n Quantity we have : " +quantity+"\n The price per tablet will be : 190 \n The total cost will be :"+sell);
        int remaining_stock = quantity-quantity2;
        System.out.println("The remaining Stock we have is : "+remaining_stock);
        System.out.println("THANK YOU FOR VISITING!!!!!");
    





       




        
        
    }
    
}
