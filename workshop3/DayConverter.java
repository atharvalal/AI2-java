package workshop3;
import java.util.Scanner;

public class DayConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int months = (totalDays % 365) / 30;
        int days = totalDays % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}

