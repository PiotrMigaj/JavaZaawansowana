package pl.migibud.enumerated;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Integer x =20;
//        Color y = Color.BLUE;
//        Color z = Color.RED;
//
//        System.out.println(y.name());
//        System.out.println(y.ordinal());
//
//        Color[] values = Color.values();
//
//        for (Color c:values) {
//            System.out.println(c.name());
//        }

        Size medium = Size.MEDIUM;
        System.out.println(medium.maxWeight);
        int mediumWeight= medium.getMaxWeight();
        System.out.println(mediumWeight);

        Size myMedium = Size.MEDIUM;

        System.out.println(MathOperation.ADD.calculate(10.0f,20.0f));



        double a = 0;



        try {
            a=Double.parseDouble("675a");
        }catch (NumberFormatException e){
            System.out.println("no nie");
        }

        System.out.println(a);


        ArrayList<String> my = new ArrayList<>();
        my.add("");

    }

}
