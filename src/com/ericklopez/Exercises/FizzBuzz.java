package com.ericklopez.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class FizzBuzz {

    //if divisible by 5 print fizz
    //if divisible by 3 print buzz
    //if divisible by both print fizzbuzz
    Scanner keyboard = new Scanner(System.in);
    int numberInputted;

    public void performFizzBuzz() {
        System.out.println("Enter a number: ");
        numberInputted = keyboard.nextInt();
        if (numberInputted % 5 == 0 && numberInputted % 3 == 0)
            System.out.println("FizzBuzz");
        else if (numberInputted % 5 == 0)
            System.out.println("Fizz");
        else if (numberInputted % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(numberInputted);
        performFizzBuzz();

    }
}
