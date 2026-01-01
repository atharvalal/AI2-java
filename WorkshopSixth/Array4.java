package WorkshopSixth;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j =0;j<2;j++){
                marks[i][j]=sc.nextInt();

            }
            
        }
        System.out.println("Student\tNepali\tEnglish");   
        for (int i = 0; i < 2; i++) {
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < 2; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }  System.out.println("\nTotal Marks:");
        for (int i = 0; i < 2; i++) {
            int total = 0;
            for (int j = 0; j < 2; j++) {
                total += marks[i][j];
            }
            System.out.println("Student " + (i + 1) + ": " + total);
        }

    }
}
