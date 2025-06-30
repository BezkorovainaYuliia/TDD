package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void Fibonachi0() {
        int expected = 0;
        int actual = Fibonacci.Fibonacci(0);
        assertEquals(expected, actual);

    }

    @Test
    void Fibonachi0() {
        int expected = 1;
        int actual = Fibonacci.Fibonacci(1);
        assertEquals(expected, actual);

    }

}