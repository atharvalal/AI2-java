package week8;

public class student {
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private static String collegeName="ISLINGTON";

    public student(int id,String name,String address,long phoneNumber){
        this.id=id;
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        


    }
     void Display(){
        System.out.println("id: "+id+"\nname: "+name+"\naddress: "+address+"\nphonenumber: "+phoneNumber);
    }

    
}
