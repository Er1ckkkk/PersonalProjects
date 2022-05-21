package com.ericklopez.Exercises;

import java.util.Scanner;

public class FizzBuzz {

    //if divisible by 5 print fizz
    //if divisible by 3 print buzz
    //if divisible by both print fizzbuzz
    Scanner keyboard = new Scanner(System.in);
    int input = keyboard.nextInt();
    public void performFizzBuzz(){
        if(input % 5 == 0 && input % 3 == 0)
            System.out.println("FizzBuzz");
        else if(input % 5 == 0)
            System.out.println("Fizz");
        else if(input % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(input);
    }


}
