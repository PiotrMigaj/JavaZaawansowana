package pl.migibud.company;

public final class Secretary extends Employee {



    public Secretary(String name, int salary) {
        super(name, salary);
        System.out.printf("Wywołuhę konstruktor z klasy Secretary z argumentami: %s i %s", this.name, this.salary);
    }

    public void makeCall(String number){
        System.out.printf("Dzwonię do " + number);
    }
}
