package pl.migibud.animal;

public class Duck extends Bird{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.printf(this.name + " duck, duck");
    }
}
