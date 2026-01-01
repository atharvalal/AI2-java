package WorkshopSixth;

public class BookCorner {
    public static void main(String[] args) {
         
    
    String[] categories = {"Fiction","Nepali"};
    String[][] titles = new String[2][1];
    double [][] prices = new double[2][1];
    titles[0][0]="Asahamati";
    prices[0][0]=750.0;
    titles[1][0]="Home-2";
    prices[1][0]=550.0;
    System.out.println("Category"+" "+"Title"+"\t"+"Price");
    for(int i =0;i<2;i++){
        System.out.printf(categories[i]+"\t"+titles[i][0]+" "+prices[i][0]+"\n");

    }
    

    
}
}