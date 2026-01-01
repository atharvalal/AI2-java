package workshop5;
import java.util.Scanner;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in series : ");
        int num = sc.nextInt();
        int temp=num;
        int evencount=0;
        int oddcount=0;
        if (temp==0){
            evencount++;

        }else{
            while (temp!=0) {
                int digit=temp%10;
                if(digit%2==0){
                    evencount++;
                }else{
                    oddcount++;

                }
                temp=temp/10;

                
            }
        }
        System.out.println("Even : "+evencount);
        System.out.println("Odd : "+oddcount);
    
        
    }
    
}
