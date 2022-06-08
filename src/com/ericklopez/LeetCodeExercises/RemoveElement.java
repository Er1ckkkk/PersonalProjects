package com.ericklopez.LeetCodeExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RemoveElement {
    Scanner keyboard = new Scanner(System.in);
    int input;
    //int arr [] = new int[10]; // was wrong because arrays need to be given a size... which we do not know
    ArrayList<Integer> arr2 = new ArrayList<>();

    public void performRemoveElement() {
        promptForNumbers();
        generateRandomNumbersIntoArray();
        printArray();
        promptForNumToRemove();
        removeNumber();
        System.exit(0);
    }

    public void promptForNumbers() {
        System.out.println("How many numbers would you like to be on your array?");
        input = keyboard.nextInt();
    }

    public void generateRandomNumbersIntoArray() {
        int min = 0;
        int max = 10;
        for (int i = 0; i < input; i++) {
            int random = (int) (Math.floor((Math.random() * 10) + 1));
            // arr[i] = random; // was wrong because arrays need to be given a size... which we do not know
            arr2.add(random);
        }
    }

    public void printArray() {
        //System.out.println(Arrays.toString(arr)); test
        System.out.println(arr2);
    }

    public void promptForNumToRemove() {
        System.out.println("What number would you like to be removed for this array?: ");
        input = keyboard.nextInt(); //num to be removed
    }

    public void removeNumber() {
        int answer = 0;
        for (int i = 0; i < arr2.size(); i++) {
            if (arr2.get(i) != input) {
                arr2.set(answer, arr2.get(i));
                answer++;
            }
        }
        printAnswer(answer);
    }

    public void printAnswer(int answer) {
        System.out.println("There are now " + answer + " elements in the array");
    }

}
