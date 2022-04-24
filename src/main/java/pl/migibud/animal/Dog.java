package pl.migibud.animal;

public class Dog extends Animal implements FastRunner{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.printf(this.name + " hau hau");
    }


    @Override
    public void runFaster() {
        System.out.println("Run faster");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }
}
