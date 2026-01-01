package workshop5;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number Series : ");
        int num= sc.nextInt();
        int reverse = 0;
        int orginal=num;
        while (num!=0) {
            int digit = num%10;
            reverse = reverse*10+digit;
            num=num/10;

            
        }
        if (orginal==reverse) {
            System.out.println("The Given number is a palindrome number ");
            
        }else{
            System.out.println("The given number is not a palindrome number ");
        }


        
    }
    
}
