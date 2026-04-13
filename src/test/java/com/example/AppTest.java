package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCalculatePerformance() {
        // Test Case 1: Alice (S Grade)
        Student s1 = new Student("Alice", 28, 19, 48); 
        assertEquals(95.0, s1.totalMarks, "Total marks incorrect for Alice");
        assertEquals("S", s1.grade, "Grade incorrect for Alice");
        assertEquals(9.5, s1.gpa, "GPA incorrect for Alice");

        // Test Case 2: Bob (F Grade)
        Student s2 = new Student("Bob", 15, 10, 20); 
        assertEquals(45.0, s2.totalMarks, "Total marks incorrect for Bob");
        assertEquals("F", s2.grade, "Grade incorrect for Bob");
        assertEquals(4.5, s2.gpa, "GPA incorrect for Bob");
    }
}
