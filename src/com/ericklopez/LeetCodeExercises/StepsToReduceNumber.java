package com.ericklopez.LeetCodeExercises;

import java.util.Scanner;

public class StepsToReduceNumber {
    Scanner keyboard = new Scanner(System.in);
    int input;
    int counter = 0;

    public void performStepsToReduceNumber(){
        System.out.println("Welcome! This simply returns the number of steps to reduce a number to zero.");
        System.out.println("If it's an even number divide it by 2, otherwise subtract 1 from it.");
        System.out.println("Please enter in any number: ");
        input = keyboard.nextInt();
        int result = calculateSteps(input);
        System.out.println("The number of steps needed to get this number to zero are: " + result);
        System.exit(0);
    }

    public int calculateSteps(int num){
       if(num == 0)
           return 0;
       if(num % 2 == 0){
           counter++;
           calculateSteps(num / 2);
       }
       else if(num % 2 == 1){
           counter++;
           calculateSteps(num - 1);
       }
       return counter;
    }
}
