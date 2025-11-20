import java.util.Scanner;
public class WaterLevelMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter water level : ");
        int water_level = sc.nextInt();
        System.out.println("Your Water Level is :"+water_level+" litres");
        int remaining_level = 1000-water_level;
      
        String Level = (water_level>=1000)?("WARNING:The Water Level has reached 1000 Litres or more"):("Status Normal : The Remaining water Level to be Filled: "+remaining_level+" Litres");
        System.out.println(Level);
        


        
    }
    
}
