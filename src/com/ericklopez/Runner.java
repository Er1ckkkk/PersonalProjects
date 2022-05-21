package com.ericklopez;

import com.ericklopez.Calculators.Calculator;
import com.ericklopez.Calculators.MortgageCalculator;
import com.ericklopez.Exercises.FizzBuzz;

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
        FIZZBUZZ("FizzBuzz",3);


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
}
