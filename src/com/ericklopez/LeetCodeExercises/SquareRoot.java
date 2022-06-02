package com.ericklopez.LeetCodeExercises;

import java.util.Scanner;

public class SquareRoot {
    Scanner keyboard = new Scanner(System.in);
    int input;

    public void performSquareRoot() {
        promptForInput();
        calculateSquareRoot();
        System.exit(0);
    }

    public void promptForInput() {
        System.out.println("Enter in a number to square root: ");
        input = keyboard.nextInt();
    }

    public void calculateSquareRoot() {
        long lowest = 0;
        long highest = input;
        long answer = 0;

        if (highest < 0) {
            System.out.println("Please enter in a number greater than 0");
            performSquareRoot();
        }
        while (lowest + 1 < highest) {
            long middle = lowest + (highest - lowest) / 2;

            if (input == middle * middle) {
                answer = middle;
                break;
            } else if (input < middle * middle)
                highest = middle;
            else if (input > middle * middle) {
                lowest = middle;
            }
        }
        if (input == answer * answer)
            System.out.println(answer);
        else if (input == highest * highest)
            System.out.println(highest);
        else {
            System.out.println(lowest);
        }
    }
}
