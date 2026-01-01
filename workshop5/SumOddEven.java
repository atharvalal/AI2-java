package workshop5;


public class SumOddEven
{
    public static void main(String[] args) {
       int sumodd = 0;
       int sumeven=0;
       System.out.println("The sum Of even and odd numbers respectively is : ");
       for (int i= 0;i<=10;i++){
        if(i%2==0){
            sumeven=sumeven+i;
        }else{
            sumodd=sumodd+i;
        }
       
       }
       System.out.println(sumeven);
       System.out.println(sumodd);


    }
}