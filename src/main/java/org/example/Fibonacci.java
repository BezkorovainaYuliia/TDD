package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(Fibonacci.fibonacciFunc(x));
    }
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
