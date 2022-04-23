package pl.migibud.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void getSalary() {

        //given

        Manager manager = new Manager("Piotr",9000,1000);

        //then
        assertEquals(10_000,manager.getSalary());

    }
}