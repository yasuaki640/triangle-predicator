package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrianglePredicatorTests {

    @Test
    void test_CompilePasses() {
    }

    @Test
    void test_Equilateral() throws Exception {
        assertEquals(1, TrianglePredicator.predicate(1, 1, 1));
    }

    @Test
    void test_ISosceles() throws Exception {
        assertEquals(2, TrianglePredicator.predicate(1, 2, 2));
    }

    @Test
    void test_Scalene() throws Exception {
        assertEquals(3, TrianglePredicator.predicate(2, 3, 4));
    }

    @Test
    void test_Irational() {
        assertThrows(Exception.class, () -> TrianglePredicator.predicate(1, 2, 3));
    }

    @Test
    void test_Negative() {
        assertThrows(Exception.class, () -> TrianglePredicator.predicate(-1, 2, 3));
    }
}
