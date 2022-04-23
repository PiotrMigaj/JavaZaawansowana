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

        showEveryElementOfArrayOrList(cars);

        System.out.println();

        List<Car> carList = List.of(cars);

        Iterator<Car> carIterator = carList.iterator();

        while (carIterator.hasNext()) {
            carIterator.next().show();
        }

        System.out.println();

        Car thirdCar = cars[2];


        cars[2].setModel("Charger");

        showEveryElementOfArrayOrList(cars);

        System.out.println();

        showEveryElementOfArrayOrList(carList);
    }

    public static <T> void showEveryElementOfArrayOrList(T[] t){

        for (T model:t) {
            System.out.println(model.toString());
        }
    }


    public static <T> void showEveryElementOfArrayOrList(List<T> t){

        Iterator<T> carIterator = t.iterator();

        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }

    }
}
