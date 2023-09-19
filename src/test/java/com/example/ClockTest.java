
package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {

    private Clock clock;

    @BeforeEach
    public void setUp() {
        clock = new Clock(12, 30);
    }

    @Test
    public void testAddMinutes() {
        clock.addMinutes(40);
        assertEquals("01:10", clock.getTime());
    }
}
