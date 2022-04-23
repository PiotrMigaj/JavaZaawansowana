package pl.migibud.company;

public class CompanyMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Piotr",6000);
        Employee employee2 = new Manager("Ania", 9000, 500);
        Employee employee3 = new Secretary("Marta",2000);

        employee1.show();
        employee2.show();

//        if (employee3 instanceof Secretary){
//            Secretary secretary = (Secretary) employee3;
//            secretary.makeCall("3256212");
//        }

        Manager manager = (Manager) employee2;
        manager.setSecretary((Secretary) employee3);
        manager.makeCall("3214532");

   //     displayInformation(employee2);

    }

    public static void displayInformation(Employee employee){

        employee.show();
    }
}
