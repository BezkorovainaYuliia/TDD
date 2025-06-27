package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void fizzBuzz_returnFizz_Numer3(){
        String expected = "Fizz";
        int n = 3;
        String actual = Main.FizzBuzzSpiel(n);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_returnBuzz_Numer5(){
        String expected = "Buzz";
        int n = 5;
        String actual = Main.FizzBuzzSpiel(n);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_returnFizzBuzz_Numer15(){
        String expected = "FizzBuzz";
        int n = 15;
        String actual = Main.FizzBuzzSpiel(n);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_return1_Numer1(){
        String expected = "1";
        int n = 1;
        String actual = Main.FizzBuzzSpiel(n);
        assertEquals(expected, actual);
    }


}