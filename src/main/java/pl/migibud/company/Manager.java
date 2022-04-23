package pl.migibud.company;

public class Manager extends Employee {

    private int bonus;
    private Secretary secretary;

    public Manager(String name, int salary) {
        super(name, salary);
        System.out.println("Constructor from class Manager with 2args");
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.println("Constructor from class Manager with 3args");
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public void makeCall(String number){
        if (secretary!=null){
            secretary.makeCall(number);
        }else{
            System.out.printf("Don't know how to call :(");
        }
    }

    public void makeSpeech(){
        System.out.println("This is motivational speech :) !!!");
    }

    public void makeSpeech(String additionalMessage){
        this.makeSpeech();
        System.out.println(additionalMessage);
    }

    @Override
    public int getSalary() {
        return this.salary + this.bonus;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Manager bonus: "+this.bonus);
        System.out.println("Salary with bonus: "+(this.salary+this.bonus ));
    }
}
