package week7;
import java.util.Scanner;
public class Employee {
   int id;
   String name;
   int salary;
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Employee [] emp = new Employee[3];


   
    for(int i =0;i<3;i++){
        emp[i]= new Employee();
        System.out.println("Enter id of "+(i+1)+" employee : ");
        emp[i].id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name of "+(i+1)+" employee : ");
        emp[i].name=sc.nextLine();
        System.out.println("Enter Salary of "+(i+1)+" employee : ");
        emp[i].salary=sc.nextInt();

    }
    for(int j =0;j<3;j++){
        System.out.println("Details of "+(j+1)+" employee : ");
        System.out.println("id :"+emp[j].id);
        System.out.println("name :"+emp[j].name);
        System.out.println("Salary :"+emp[j].salary);
    } 
    
    int max = 0;
    int id2=0;
    String name2 = "";
    for(int a=0;a<3;a++){
       
        if(emp[a].salary>max){
            max=emp[a].salary;
             id2= emp[a].id;
             name2=emp[a].name;
      
        }
        
    }
    System.out.println("Highest salary between three employees is : \n" +id2+" : "+name2+" : "+max);
    for (int i = 0; i < emp.length - 1; i++) {
        for (int j = i + 1; j < emp.length; j++) {
            if (emp[i].salary > emp[j].salary) {
                Employee temp = emp[i];
                emp[i] = emp[j];
                emp[j] = temp;
            }
        }
    }

    // Display salaries in ascending order
    System.out.println("\nEmployees sorted by Salary (Ascending):");
    for (int i = 0; i < emp.length; i++) {
        System.out.println(emp[i].id + " " + emp[i].name + " " + emp[i].salary);
    }

    



   }


    
}
