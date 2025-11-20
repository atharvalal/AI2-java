package workshop3;
import java.util.Scanner;

public class MathsOperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 =sc.nextInt();
        if(num1>num2){
            System.out.println("the greater number is "+num1);
        }else{
            System.out.println("the greater number is "+num2);
        }
        int sum = num1+num2;
        System.out.println("sum : "+sum);
        


    }
}