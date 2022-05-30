package com.ericklopez.LeetCodeExercises;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    Scanner keyboard = new Scanner(System.in);

    public void performValidParenthesis() {
        printIntro();
        System.out.println("Please enter in brackets [], (), {} in the order that you would like: ");
        String input = keyboard.nextLine();
        boolean result = isValid(input);
        System.out.println(result);
        System.exit(0);
    }

    public void printIntro() {
        System.out.println("Welcome! This program will tell you if it is considered valid or invalid");
        System.out.println("To be valid Open brackets must be closed by the same type of brackets.\n" +
                "Open brackets must be closed in the correct order.");
        System.out.println();

    }

    public boolean isValid(String input) {
        Stack<Character> stackOfCharacters = new Stack();
        //Checks to see if there is an input and if not return false.
        if (input.length() == 0)
            return false;

        for (int i = 0; i < input.length(); i++) {
            char bracketAtI = input.charAt(i);
            //if nothing in stack, put the bracketAtI into it

            if (stackOfCharacters.isEmpty())
                stackOfCharacters.push(bracketAtI);

            //if statement to check everything else
            else if ((stackOfCharacters.peek() == '(' && bracketAtI == ')') ||
                    (stackOfCharacters.peek() == '[' && bracketAtI == ']') ||
                    (stackOfCharacters.peek() == '{' && bracketAtI == '}')) {
                //this gets rid of the bracket in the stack... onto the next one!
                stackOfCharacters.pop();
            } else{
                stackOfCharacters.push(bracketAtI);
                //if the user put in an invalid order of brackets, the invalid one will stay in the stack
                //this is important because when the for loop ends it will check if it is empty or not
                //if the closing bracket is never found it never pops... meaning it's not empty
                //so false is returned
            }
        }
        return stackOfCharacters.isEmpty();
    }
}
