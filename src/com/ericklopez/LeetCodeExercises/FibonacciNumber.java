package com.ericklopez.LeetCodeExercises;

import java.util.Scanner;

public class FibonacciNumber {

    Scanner keyboard = new Scanner(System.in);

    public void performFibonacciNumber(){
        System.out.println("Please enter in a number: ");
        int input = keyboard.nextInt();
        int result = doMath(input);
        System.out.println(result);
        System.exit(0);
    }

    public int doMath(int input){
        if( input <= 1)
            System.out.println(input);
        int first = 0;
        int second = 1;

        for(int i = 2; i <= input; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
