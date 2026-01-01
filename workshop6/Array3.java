

package workshop6;
import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name= {"Morang","kathmandu","Kaski","Sindhuli"};
        for(int i =0;i<4;i++){
            System.out.println((i+1)+" . "+name[i]);

        }
        System.out.println("Initial names are : ");
        for (int a= 0;a<4;a++){
            System.out.println(name[a]);
        }
        System.out.println("Enter number of districts : ");
        int size=sc.nextInt();
        sc.nextLine();
        String[] name2= new String[size];
        System.out.println("Enter names : ");
        for ( int b=0;b<size;b++){
            name2[b]=sc.nextLine();
        }
        System.out.println("names:");
        for (int c =0;c<size;c++){
            System.out.println(name2[c]);
        }
    }
    
}
