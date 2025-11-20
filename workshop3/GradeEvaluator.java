package workshop3;
import java.util.Scanner;
public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your grade : ");
        int grade =sc.nextInt();
        String result =(grade>=40)?"pass":"fail";
        System.out.print("The pass Grade is \"40\" \nAs you have obtained "+grade+"\nYour result is :");
        System.out.println(result);
       
        
    }
    
}
