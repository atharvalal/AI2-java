package workshop5;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        
        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
    
}
