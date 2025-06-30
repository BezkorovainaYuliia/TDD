package org.example;

public class Fibonacci {
public static int fibonacciFunc(int x) {
    if (x <= 1) { return x;}
     if (x >= 2) {
        return fibonacci(x);
    }
    return 0;
}

static int fibonacci(int x) {
    if (x <= 1) { return x;}
    return fibonacci(x - 1) + fibonacci(x - 2);
}
}
