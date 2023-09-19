
package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car();
    }

    @Test
    public void testSpeedUp() {
        car.speedUp(10);
        assertEquals(10, car.currentSpeed());
    }

    @Test
    public void testSlowDown() {
        car.speedUp(20);
        car.slowDown(5);
        assertEquals(15, car.currentSpeed());
    }
}
