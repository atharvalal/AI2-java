

package workshop6;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] values= new int[5];
        System.out.println("Enter values :");
        for(int i =0 ;i<5;i++){
            values[i]=sc.nextInt();
        }
        System.out.println("values are : ");
        for(int j=0;j<5;j++){
            System.out.println(values[j]);

        }
        System.out.println("Sum : ");
        int sum=0;
        for(int a =0;a<5;a++){
            sum+=values[a];

        }
        System.out.println(sum);
        float avg = sum/5;
        System.out.println("Average is : "+avg);
        int max=values[0];
        for(int b=0;b<5;b++){
            if(values[b]>max){
                max=values[b];
            }
            }
            System.out.println("the max value is : "+max);
        int min=values[0];
        for(int c=0;c<5;c++){
            if(values[c]<min){
                min=values[c];
            }
            }
            System.out.println("the min values is :"+min);

    }
    
}
