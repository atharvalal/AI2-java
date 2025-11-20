package workshop3;
import java.util.Scanner;
public class TimeConverter
{
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter time in terms of second : ");
    int totalseconds=sc.nextInt();
    int hours=totalseconds/3600;
    int remainingseconds=totalseconds%3600;
    int minutes=remainingseconds/60;
    int seconds=totalseconds%60;
    System.out.println("Hours : "+hours);
    System.out.println("Minutes : "+minutes);
    System.out.println("Seconds : "+seconds);

 }   
}