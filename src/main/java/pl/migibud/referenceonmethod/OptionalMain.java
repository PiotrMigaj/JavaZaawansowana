package pl.migibud.referenceonmethod;

import pl.migibud.fruits.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class OptionalMain {

    public static void main(String[] args) throws Exception {


        Apple apple = null;

//        Optional<Integer> optional = Optional.ofNullable(apple)
//                        .map(apple1 -> apple1.getWeight());
//
//        int a = optional.orElseThrow(Exception::new);

//        System.out.println(a);


        List<Apple> appleList = new ArrayList<>();
        appleList.add(null);

        System.out.println(appleList);



    }

}
