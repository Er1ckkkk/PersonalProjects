package com.ericklopez;

import com.ericklopez.Calculators.Calculator;
import com.ericklopez.Calculators.MortgageCalculator;
import com.ericklopez.Exercises.*;
import com.ericklopez.LeetCodeExercises.*;

import java.util.Scanner;

public class Runner {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        printOptionMenu();
        gatherInput();

    }

    private static int gatherInput() {
        return keyboard.nextInt();
    }
    private static void printOptionMenu() {
        System.out.println("Choose the type of programs you would like open: ");
        System.out.println("-----------------------------");

        for (Options options : Options.values()) {
            System.out.println(options.option + ". " + options.title);
        }
        int selectedOption = gatherInput();

        switch (selectedOption) {
            case 1:
                printCalculators();
                break;

            case 2:
                printExercises();
                break;

            case 3:
                printLeetCode();
                break;
        }
    }

    private enum Options {
        CALCULATORS("Calculators", 1),
        EXERCISES("Exercises", 2),
        LEETCODE_EXERCISES("LeetCode Exercises", 3);

        private String title;
        private int option;

        Options(String title, int option) {
            this.title = title;
            this.option = option;
        }
    }

    private enum CalculatorOptions {
        CALCULATOR("Calculator", 1),
        MORTGAGE_CALCULATOR("Mortgage Calculator", 2);

        private String title;
        private int option;

        CalculatorOptions(String title, int option) {
            this.title = title;
            this.option = option;
        }
    }

    private enum ExerciseOptions {
        BINARY_SEARCH("Binary Search", 1),
        FIZZBUZZ("FizzBuzz", 2),
        HEAP_SORT("Heap Sort", 3),
        LINEAR_SEARCH("Linear Search", 4),
        LINKED_LIST("Linked List", 5);

        private String title;
        private int option;

        ExerciseOptions(String title, int option) {
            this.title = title;
            this.option = option;
        }
    }

    private enum LeetCodeOptions {
        COIN_CHANGE("Coin Change", 1),
        MERGE_TWO_SORTED_LISTS("Merge Two Sorted Lists", 2),
        PALINDROME("Palindrome", 3),
        REMOVE_ELEMENT("Remove Element", 4),
        REMOVE_PALINDROMIC_SUBSEQUENCES("Remove Palindromic Subsequences", 5),
        ROMAN_TO_INTEGER("Roman To Integer", 6),
        SQUARE_ROOT("Square Root", 7),
        STEPS_TO_REDUCE_NUMBER("Steps To Reduce A Number", 8),
        TWO_SUM("Two Sum", 9),
        VALID_PARENTHESIS("Valid Parenthesis", 10),
        FIBONACCI_NUMBER("Fibonacci Number", 11);

        private String title;
        private int option;

        LeetCodeOptions(String title, int option) {
            this.title = title;
            this.option = option;
        }
    }

    private static void printCalculators() {
        System.out.println("Choose the type of calculator: ");
        System.out.println("-----------------------------");

        for (CalculatorOptions calculatorOptions : CalculatorOptions.values()) {
            System.out.println(calculatorOptions.option + ". " + calculatorOptions.title);
        }
        int selectedOption = gatherInput();

        switch (selectedOption) {
            case 1:
                startCalculator();
                break;

            case 2:
                startMortgageCalculator();
                break;
        }
    }

    private static void printExercises() {
        System.out.println("Choose the type of exercises you would like to open: ");
        System.out.println("-----------------------------------------------------");

        for (ExerciseOptions exercisesOptions : ExerciseOptions.values()) {
            System.out.println(exercisesOptions.option + ". " + exercisesOptions.title);
        }
        int selectedOption = gatherInput();

        switch (selectedOption) {
            case 1:
                startBinarySearch();
                break;

            case 2:
                startFizzBuzz();
                break;

            case 3:
                startHeapSort();
                break;

            case 4:
                startLinearSearch();
                break;

            case 5:
                startLinkedList();
                break;

        }
    }

    private static void printLeetCode() {
        System.out.println("Choose the type of LeetCode problem you would like to open: ");
        System.out.println("------------------------------------------------------------");

        for (LeetCodeOptions leetCodeOptions : LeetCodeOptions.values()) {
            System.out.println(leetCodeOptions.option + ". " + leetCodeOptions.title);
        }

        int selectedOption = gatherInput();

        switch (selectedOption) {
            case 1:
                startCoinChange();
                break;

            case 2:
                startMergeTwoSortedLists();
                break;

            case 3:
                startPalindrome();
                break;

            case 4:
                startRemoveElement();
                break;

            case 5:
                startRemovePalindromeSubsequences();
                break;

            case 6:
                startRomanToInteger();
                break;

            case 7:
                startSquareRoot();
                break;

            case 8:
                startStepsToReduceNumber();
                break;

            case 9:
                startTwoSum();
                break;

            case 10:
                startValidParenthesis();
                break;

            case 11:
                startFibonacciNumber();
                break;


        }
    }

    private static void startCalculator() {
        Calculator calculator = new Calculator();
        calculator.performCalculator();
    }

    private static void startMortgageCalculator() {
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        mortgageCalculator.performMortgageCalculator();
    }

    private static void startFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.performFizzBuzz();
    }

    private static void startBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.performBinarySearch();
    }

    private static void startLinearSearch() {
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.performLinearSearch();
    }

    private static void startHeapSort() {
        HeapSort heapSort = new HeapSort();
        heapSort.performHeapSort();
    }

    private static void startStepsToReduceNumber() {
        StepsToReduceNumber stepsToReduceNumber = new StepsToReduceNumber();
        stepsToReduceNumber.performStepsToReduceNumber();
    }

    private static void startTwoSum() {
        TwoSum twoSum = new TwoSum();
        twoSum.performTwoSum();
    }

    private static void startValidParenthesis() {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        validParenthesis.performValidParenthesis();
    }

    private static void startPalindrome() {
        Palindrome palindrome = new Palindrome();
        palindrome.performPalindrome();
    }

    private static void startSquareRoot() {
        SquareRoot squareRoot = new SquareRoot();
        squareRoot.performSquareRoot();
    }

    private static void startRomanToInteger() {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.performRomanToInteger();
    }

    private static void startMergeTwoSortedLists() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.performMergeTwoSortedLists();
    }

    private static void startLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.performLinkedList();
    }

    private static void startRemoveElement() {
        RemoveElement removeElement = new RemoveElement();
        removeElement.performRemoveElement();
    }

    private static void startRemovePalindromeSubsequences() {
        RemovePalindromicSubsequences removePalindromicSubsequences = new RemovePalindromicSubsequences();
        removePalindromicSubsequences.performRemovePalindromeSubsequences();
    }

    private static void startCoinChange() {
        CoinChange coinChange = new CoinChange();
        coinChange.performCoinChange();
    }

    private static void startFibonacciNumber(){
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        fibonacciNumber.performFibonacciNumber();
    }


}
