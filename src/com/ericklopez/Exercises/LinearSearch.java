package com.ericklopez.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    Scanner keyboard = new Scanner(System.in);

    public void performLinearSearch(){
        int givenArray[] = {1, 34, 232, 5, 503, 43 ,75, 2, 7, 30, 328};
        printIntro();
        System.out.println(Arrays.toString(givenArray));

        System.out.println("Please enter in the number you are trying to find from this list: ");
        int findMe = keyboard.nextInt();
        int result = linearSearch(givenArray, findMe);
        if (result == -1)
            System.out.println("The number you tried to look for is not in the array!");
        else
            System.out.println("The number: " + findMe + " was found at index: " + result);
        System.exit(0);
    }



    public void printIntro(){
        System.out.println("The array has the following numbers: ");
    }

    int linearSearch(int arr[], int findMe){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == findMe)
                return i;
        }
        return -1;
    }

}
