package workshop6;
import java.util.Scanner;
public class Array1D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age[]=new int[5];
        int matrix[][]= new int[2][2];
        String[] Name = new String[5];
        System.out.println("enter names : ");
        for (int i=0;i<5;i++){
            Name[i]=sc.nextLine();
        }
        System.out.println("Names are : ");
        for (int j =0;j<5;j++){
            System.out.println(Name[j]);
        }
        System.out.println(Name[2]);
        Name[4]="Ram";
        System.out.println("4 index name : "+Name[4]);

        
        System.out.println("Enter a New name : ");
        String newname=sc.nextLine();
        System.out.println("choose index");
        int index=sc.nextInt();
        sc.nextLine();
        Name[index]=newname;
        System.out.println("updates names : ");
        for (int a =0;a<5;a++){
            System.out.println(Name[a]);
        }



    }
    
    
}
