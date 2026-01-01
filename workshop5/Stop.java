package workshop5;

public class Stop {
    public static void main(String[] args) {
        for(int i =0 ; i<=50 ; i++ ){
            if(i%2==0){
                continue;
            }
            if (i%13==0) {
                System.out.println("Stopping as num is divisible by 13 ");
                break;
            }
            System.out.println(i);
        }
    }
    
}
