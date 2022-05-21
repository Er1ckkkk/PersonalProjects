package com.ericklopez.Calculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public void performMortgageCalculator(){
        promptForInput();
        performMortgageCalculations();
        printMortgage();
    }

    Scanner keyboard = new Scanner(System.in);
    int principle;
    double annualInterestRate;
    int period;
    double mortgage;
    int months = 12;
    int getPercent = 100;

    public void promptForInput(){

        while(true){
            System.out.print("Principle ($1k - $1M): ");
            principle = keyboard.nextInt();
            if( principle >= 1000 & principle <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = keyboard.nextDouble();
            if(annualInterestRate > 0 & annualInterestRate <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while(true){
            System.out.print("Period (Years): ");
            period = keyboard.nextInt();
            if(period >= 1 && period <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
    }

    public void performMortgageCalculations(){
        annualInterestRate = (annualInterestRate / getPercent) / months;
        period = period * 12;
        mortgage = principle * ((annualInterestRate * Math.pow(1 + annualInterestRate, period) / (Math.pow(1 + annualInterestRate, period) - 1)));
    }

    public void printMortgage(){
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
        System.exit(0);
    }



}
