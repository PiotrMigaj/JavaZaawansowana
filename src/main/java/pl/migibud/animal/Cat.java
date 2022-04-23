package pl.migibud.animal;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.printf(this.name + " meow, meow");
    }
}
