package week7;
import java.util.Scanner;
public class Rectangle {
    Float length;
    float breadth;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Rectangle R1 = new Rectangle();
        System.out.println("Enter length : ");
        R1.length= sc.nextFloat();
        System.out.println("Enter Breadth : ");
        R1.breadth=sc.nextFloat();
        Float Area= R1.length*R1.breadth;
        System.out.println("The Area of Rectangle is :  "+Area);
        Rectangle R2 = new Rectangle();
        System.out.println("Enter length : ");
        R2.length= sc.nextFloat();
        System.out.println("Enter Breadth : ");
        R2.breadth=sc.nextFloat();
        Float Area2= R2.length*R2.breadth;
        System.out.println("The Area of Second Rectangle is :  "+Area2);



    }
    
}
