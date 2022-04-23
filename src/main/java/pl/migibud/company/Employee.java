package pl.migibud.company;

public class Employee {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor from class Employee");
    }

    public int getSalary() {
        return salary;
    }

    public void show(){
        System.out.printf("Employee name: %s, Employee salary: %d \n",this.name,this.salary);
    }
}
