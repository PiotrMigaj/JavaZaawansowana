package pl.migibud.utils;

public abstract class StringHelper {

    private StringHelper(){}

    public static int parseToInt(String value){

        try {
            return Integer.parseInt(value);
        }catch (NumberFormatException e){
            System.out.println("Zamiana nie powiodła się "+e.getMessage());
            return 0;
        }finally {
            System.out.println("Zadanie zakończone!");
        }

    }

    public static String calculateSalary(int salary, int bonus) {

        int sum = salary+bonus;
        if (sum<0){
            throw new SalaryNegativeNumberException(sum);
        }

        return String.valueOf(sum);
    }



}
