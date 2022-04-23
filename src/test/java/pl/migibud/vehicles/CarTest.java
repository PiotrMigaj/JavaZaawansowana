package pl.migibud.vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void notNullAfterCreatingCar(){
        //given
        Car car = new Car("Ford","T");
        //then
        assertNotNull(car);
    }

}