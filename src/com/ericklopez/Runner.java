package com.ericklopez;

import com.ericklopez.Calculators.Calculator;

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
        CALCULATOR("Calculator", 1);


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

        }


    }

    private static void startCalculator(){
        Calculator calculator = new Calculator();
        calculator.performCalculator();
    }
}
