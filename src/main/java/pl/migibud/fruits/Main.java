package pl.migibud.fruits;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple(10);



        Box<Apple> box = new Box<>(apple);
        System.out.println(box.getContent());

        Box<Integer> box1 = new Box<>(32);
        System.out.println(box1.getContent());

    }

}
