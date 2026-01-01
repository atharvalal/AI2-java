package workshop3;
import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;


        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }


        double average = sum / 5.0;
        double percentage = (sum / 500.0) * 100;

   
        System.out.println("\nTotal Marks = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Percentage = " + percentage + "%");

       
    }
}
