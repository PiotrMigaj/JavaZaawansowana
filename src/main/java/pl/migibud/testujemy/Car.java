package pl.migibud.testujemy;

public class Car {

    private String name;
    private Car car;

    public Car(String name, Car car) {
        this.name = name;
        this.car=car;
    }

    public void doSth(Car car, Plane plane){
        car.name="";
        plane.getPlaneName();
    }
}
