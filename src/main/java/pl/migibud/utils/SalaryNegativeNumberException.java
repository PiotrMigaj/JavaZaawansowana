package pl.migibud.utils;

public class SalaryNegativeNumberException extends RuntimeException{

    public SalaryNegativeNumberException(int salary) {

        super("Penja nie może być ujemna " + salary);

    }
}
