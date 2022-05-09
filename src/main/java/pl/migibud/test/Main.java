package pl.migibud.test;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> myMap = new HashMap<>();

        myMap.put("123456789",354);

        System.out.println(myMap);


//        myMap.entrySet().stream().map(v->v.getKey()).filter(v->v.equals());


    }

}
