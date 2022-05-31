package com.ericklopez.LeetCodeExercises;

import java.util.Scanner;

public class Palindrome {
    Scanner keyboard = new Scanner(System.in);
    int input;


    public void performPalindrome(){
        promptForInput();
        boolean result = isPalindrome(input);
        System.out.println(result);
        System.exit(0);
    }

    public int promptForInput(){
        System.out.println("Please enter any number. This program will check if it is a palindrome");
        return input = keyboard.nextInt();
    }

    public boolean isPalindrome(int userInput){
        //if negative number, automatically false
        if(userInput < 0)
            return false;
        //if user input is 0 - 9
        else if(userInput >= 0 && userInput <=9)
            return true;
        else{
            String numHolder = "";
            int temp = userInput;

            while(temp > 0){
                numHolder += temp % 10; // This gets the LAST NUMBER
                temp = temp / 10; // gets "rid" of number that was just added to the numHolder
            }
            if(Long.parseLong(numHolder) - userInput == 0) //originally had this as Integer.parseInt but if too big gives error

                return true;
            else
                return false;
        }
    }
}
