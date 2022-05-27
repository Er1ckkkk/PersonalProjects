package com.ericklopez;

import com.ericklopez.Calculators.Calculator;
import com.ericklopez.Calculators.MortgageCalculator;
import com.ericklopez.Exercises.BinarySearch;
import com.ericklopez.Exercises.FizzBuzz;
import com.ericklopez.Exercises.HeapSort;
import com.ericklopez.Exercises.LinearSearch;
import com.ericklopez.LeetCodeExercises.StepsToReduceNumber;

import java.util.Scanner;

public class Runner {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        printMenu();
        gatherInput();
    }

    private static int gatherInput(){
        return keyboard.nextInt();
    }



    private enum Exercises{
        CALCULATOR("Calculator", 1),
        MORTGAGE_CALCULATOR("Mortgage Calculator", 2),
        FIZZBUZZ("FizzBuzz",3),
        BINARY_SEARCH("Binary Search", 4),
        LINEAR_SEARCH ("Linear Search", 5),
        HEAP_SORT("Heap Sort", 6),
        STEPS_TO_REDUCE_NUMBER("Steps To Reduce A Number", 7);


        private String title;
        private int option;

        Exercises(String title, int option){
            this.title = title;
            this.option = option;
        }
    }



    private static void printMenu(){
        System.out.println("Choose an exercise to demo: ");
        System.out.println("-----------------------------");
        for(Exercises exercises : Exercises.values()){
            System.out.println(exercises.option + ". " + exercises.title);
        }
        int selectedOption = gatherInput();

        switch(selectedOption){
            case 1:
                startCalculator();
                break;
            case 2:
                startMortgageCalculator();
                break;
            case 3:
                startFizzBuzz();
                break;
            case 4:
                startBinarySearch();
                break;
            case 5:
                startLinearSearch();
                break;
            case 6:
                startHeapSort();
                break;
            case 7:
                startStepsToReduceNumber();
                break;

        }


    }

    private static void startCalculator(){
        Calculator calculator = new Calculator();
        calculator.performCalculator();
    }

    private static void startMortgageCalculator(){
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        mortgageCalculator.performMortgageCalculator();
    }

    private static void startFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.performFizzBuzz();
    }
    private static void startBinarySearch(){
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.performBinarySearch();
    }

    private static void startLinearSearch(){
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.performLinearSearch();
    }

    private static void startHeapSort(){
        HeapSort heapSort = new HeapSort();
        heapSort.performHeapSort();
    }

    private static void startStepsToReduceNumber(){
        StepsToReduceNumber stepsToReduceNumber = new StepsToReduceNumber();
        stepsToReduceNumber.performStepsToReduceNumber();
    }
}
