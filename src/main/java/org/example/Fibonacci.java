package org.example;

public class Fibonacci {
public static int Fibonacci(int x) {
    if (x <= 1) { return x;}
    int vorLetzteFib = 1;
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
