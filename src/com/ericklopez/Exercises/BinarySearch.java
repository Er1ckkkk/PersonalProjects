package com.ericklopez.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    //Given an arr[] of n elements, find element x in that arr[]
    //If not in arr[], return -1
    Scanner keyboard = new Scanner(System.in);

    /*
    public static void main (String[] args){
        int randomNumbers[] = {1, 34, 93, 12, 4, 5, 93, 10};
        sortGivenArray(randomNumbers);
        System.out.println("The array in order is ");
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("Now we will try to find the number");
        int result = binarySearch(randomNumbers, 12);
        System.out.println( result);
    }
    */
    public void performBinarySearch() {
        int randomNumbers[] = {1, 34, 97, 12, 4, 5, 93, 10};
        printIntro();
        sortGivenArray(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("Please enter in a number you would like to search for in this array: ");
        int findMe = keyboard.nextInt();
        int result = binarySearch(randomNumbers, findMe);
        if (result == -1)
            System.out.println("The number is not in the list!");
        else
            System.out.println("The index of the number you were looking for is: " + result);
        System.exit(0);
    }

    public void printIntro() {
        System.out.println("You are given a list of the following numbers: ");
        System.out.println(" 1, 34, 97, 12, 4, 5, 93, 10");
        System.out.println("Next we will sort the array: ");
    }

    public void sortGivenArray(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    int binarySearch(int arr[], int findMe) {
        int left = 0;
        int right = arr.length - 1;
        int middle;

        while (left <= right) {
            middle = left + (right - left) / 2;
            if (arr[middle] == findMe)
                return middle;
            else if (arr[middle] > findMe) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1; // return this if not in array
    }
}
