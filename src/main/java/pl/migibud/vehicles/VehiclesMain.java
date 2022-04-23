package pl.migibud.vehicles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VehiclesMain {

    public static void main(String[] args) {
        runMyApp();
    }

    public static void runMyApp() {

        Car[] cars = new Car[5];
        cars[0] = new Car("Ford", "T");
        cars[1] = new Car("Ford", "Mustang");
        cars[2] = new Car("Dodge", "Viper");
        cars[3] = new Car("Fiat", "Punto");
        cars[4] = new Car("Seat", "Leon");

        for (Car c : cars) {
            c.show();
        }

        System.out.println();

        List<Car> carList = List.of(cars);

        Iterator<Car> carIterator = carList.iterator();

        while (carIterator.hasNext()) {
            carIterator.next().show();
        }

        System.out.println();

        cars[2].setModel("Charger");

        for (Car c : cars) {
            c.show();
        }

        System.out.println();

        carIterator = carList.iterator();

        while (carIterator.hasNext()) {
            carIterator.next().show();
        }


    }

}
