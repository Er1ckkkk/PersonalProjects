package com.ericklopez.LeetCodeExercises;

import java.util.Scanner;

public class RemovePalindromicSubsequences {
    Scanner keyboard = new Scanner(System.in);
    String input = "";

    public void performRemovePalindromeSubsequences() {
        printIntro();
        promptForInput();
        boolean result = checkForPalindrome();
        int output = answer(result);
        System.out.println(output);
        System.exit(0);
    }

    public void printIntro() {
        System.out.println("Welcome! This program will output the minimum number of steps to empty out a string");
        System.out.println("It can remove palindromic subsequences from the string in a SINGLE step");
        System.out.println();
    }

    public void promptForInput() {
        System.out.println("Please enter in letters consisting of ONLY a's and b's: ");
        input = keyboard.nextLine();
    }

    public boolean checkForPalindrome() {
        int marker = 0;
        int size = input.length();

        while (marker <= (size / 2)) {
            if (input.charAt(marker) != input.charAt(size - 1 - marker++))
                return false;
        }
        return true;
    }

    public int answer(boolean result) {
        if (result == false)
            return 2;
        else
            return 1;

    }
}
