
package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student(85);
    }

    @Test
    public void testGrade() {
        assertEquals("B", student.grade());
    }

    @Test
    public void testIsPassing() {
        assertEquals(true, student.isPassing());
    }
}
