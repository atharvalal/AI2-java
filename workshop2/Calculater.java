import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1= sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("the greater number is : "+num1);
        }else{
            System.out.println("the greater number is : "+num2);
        }
        int sum = num1+num2;
        int multi = num1*num2;
        float div = num1/num2;
        int sub= num1-num2;
        float modulus = num1%num2;
        System.out.println("values of different operation from two numbers : ");
        System.out.println("sum :"+sum);
        System.out.println("multiplication: "+multi);
        System.out.println("divide : "+div);
        System.out.println("substraction : "+sub);
        System.out.println("modulus : "+modulus);

        
    }
    
}
