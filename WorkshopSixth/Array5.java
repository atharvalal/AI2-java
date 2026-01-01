package WorkshopSixth;
import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] names= new String[2][3];
         System.out.println("Enter names : ");
         for(int i =0;i<1;i++){
            for(int j =0;j<3;j++){
                names[i][j]=sc.nextLine();
            }
         }
        System.out.println("Names are : ");
        for(int a =0;a<2;a++){
            for(int b =0;b<3;b++){
                System.out.print(names[a][b]+" ");
                
            }
            System.out.println();
         }

        
    }
    
}
