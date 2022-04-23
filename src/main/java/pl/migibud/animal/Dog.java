package pl.migibud.animal;

public class Dog extends Animal implements Runner{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.printf(this.name + " hau hau");
    }

    @Override
    public void run() {
        System.out.printf("Dog runs");
    }
}
