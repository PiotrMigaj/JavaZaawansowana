package pl.migibud.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void show() {
        //given
        Employee employee = new Employee("Piotr",9000);
        //then
        employee.show();
    }
}