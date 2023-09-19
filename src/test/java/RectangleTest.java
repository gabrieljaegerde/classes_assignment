
package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    public void setUp() {
        rectangle = new Rectangle(10, 5);
    }

    @Test
    public void testArea() {
        assertEquals(50, rectangle.area());
    }

    @Test
    public void testPerimeter() {
        assertEquals(30, rectangle.perimeter());
    }
}
