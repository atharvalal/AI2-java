package week7;
import java.util.Scanner;
public class Book {
    String title;
    String Author;
    int price;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Book Book1= new Book();
        System.out.println("Enter author name :");
        Book1.Author=sc.nextLine();
       
        System.out.println("Enter Title: ");
        Book1.title=sc.nextLine();
        System.out.println("Enter price : ");
        Book1.price=sc.nextInt();

        sc.nextLine();
        Book Book2 = new Book();
        System.out.println("Enter Details of Second Book");
        System.out.println("Enter author name :");
        Book2.Author=sc.nextLine();

        System.out.println("Enter Title: ");
        Book2.title=sc.nextLine();
        System.out.println("Enter price : ");
        Book2.price=sc.nextInt();

        System.out.println("The book details are : ");
        System.out.println("Book 1 : ");
        System.out.println("Author : "+Book1.Author);
        System.out.println("Tiltle : "+Book1.title);
        System.out.println("Price : "+Book1.price);
        System.out.println("Book 2 : ");
        System.out.println("Author : "+Book2.Author);
        System.out.println("Tiltle : "+Book2.title);
        System.out.println("Price  : "+Book2.price);
        

    }
    
}
