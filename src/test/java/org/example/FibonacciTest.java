package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void Fibonachi0() {
        int expected = 0;
        int actual = Fibonacci.fibonacciFunc(0);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi1() {
        int expected = 1;
        int actual = Fibonacci.fibonacciFunc(1);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi2() {
        int expected = 1;
        int actual = Fibonacci.fibonacciFunc(2);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi3() {
        int expected = 2;
        int actual = Fibonacci.fibonacciFunc(3);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi4() {
        int expected = 3;
        int actual = Fibonacci.fibonacciFunc(4);
        assertEquals(expected, actual);

    }
    @Test
    void Fibonachi5() {
        int expected = 5;
        int actual = Fibonacci.fibonacciFunc(5);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi6() {
        int expected = 8;
        int actual = Fibonacci.fibonacciFunc(6);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi7() {
        int expected = 13;
        int actual = Fibonacci.fibonacciFunc(7);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi8() {
        int expected = 21;
        int actual = Fibonacci.fibonacciFunc(8);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi12() {
        int expected = 144;
        int actual = Fibonacci.fibonacciFunc(12);
        assertEquals(expected, actual);

    }
}