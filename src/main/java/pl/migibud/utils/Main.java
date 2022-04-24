package pl.migibud.utils;

public class Main {
    public static void main(String[] args)  {

        System.out.println(StringHelper.parseToInt("fsdfs"));

        String s = StringHelper.calculateSalary(10, 0);
        System.out.println(s);

        StringHelper.calculateSalary(10,-50);



    }
}
