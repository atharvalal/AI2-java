package week10;

public class Person {
    private  int id;
    private String name;
    private double salary;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }
    public String setName(String name) {
        return this.name = name;
    }
    public int  setId(int id) {
        return  this.id=id;

    }
    @Override
    public String toString(){
        return "ID: " + this.id + " Name: " + this.name + " Salary: " + this.salary;

    }
    public double calculateSalary() {
        return this.salary;

    }
}
