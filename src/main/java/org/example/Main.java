package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.FizzBuzzSpiel(3));
    }
    public static String FizzBuzzSpiel(int number) {
        String result = "";
        if (number % 3 == 0) result += "Fizz";
        if (number % 5 == 0) result += "Buzz";
        return result.isEmpty() ? String.valueOf(number) : result;
    }
}