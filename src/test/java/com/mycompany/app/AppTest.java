package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    private static final double EPS = 0.0000001;

    @Test
    public void test1() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), EPS);
    }

    @Test
    public void test2() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), EPS);
    }

    @Test
    public void test3() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(0.0, sqrt.average(-2.0, 2.0), EPS);
    }

    @Test
    public void test4() {
        Sqrt sqrt = new Sqrt(1.0);
        assertTrue(sqrt.good(3.0, 9.0));
    }

    @Test
    public void test5() {
        Sqrt sqrt = new Sqrt(1.0);
        assertFalse(sqrt.good(2.0, 9.0));
    }

    @Test
    public void test6() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.5, sqrt.improve(1.0, 4.0), EPS);
    }

    @Test
    public void test7() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), EPS);
    }

    @Test
    public void test8() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(2.0, sqrt.iter(1.0, 4.0), EPS);
    }

    @Test
    public void test9() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), EPS);
    }

    @Test
    public void test10() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), EPS);
    }

    @Test
    public void test11() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), EPS);
    }

    @Test
    public void test12() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), EPS);
    }
}
