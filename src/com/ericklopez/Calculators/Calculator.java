package com.ericklopez.Calculators;

import java.util.Scanner;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    Scanner keyboard = new Scanner(System.in);

    public void performCalculator(){
        promptForExecution();
    }

    public void promptForInput() {
        System.out.println("What is the first number? ");
        firstNumber = keyboard.nextDouble();
        System.out.println("What is the second number? ");
        secondNumber = keyboard.nextDouble();
    }

    public void promptForExecution() {
        String [] operations = {"Addition", "Subtraction", "Multiplication", "Division", "Exit Program"};
        int option;
        double result;
        System.out.println("What would you like to do? ");
        System.out.println("---------------------------");
        for (int i = 1;  i < 6; i++){
            System.out.println( i +". " + operations[i-1]);
        }
        option = keyboard.nextInt();

        switch (option){
            case 1:
                promptForInput();
                result = firstNumber + secondNumber; //addition
                System.out.println(result);
                break;
            case 2:
                promptForInput();
                result = firstNumber - secondNumber; //subtraction
                System.out.println(result);
                break;
            case 3:
                promptForInput();
                result = firstNumber * secondNumber; //multiplication
                System.out.println(result);
                break;
            case 4:
                promptForInput();
                result = firstNumber / secondNumber;
                System.out.println(result);
                break;
            case 5:
                System.exit(0);
        }
        promptForExecution();
    }
}
