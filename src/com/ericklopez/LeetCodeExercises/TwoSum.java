package com.ericklopez.LeetCodeExercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    int [] givenNumbers = {1, 3, 53, 2, 10, 4, 7};
    Scanner keyboard = new Scanner(System.in);
    int sumToFind;

    public void performTwoSum(){
    printIntro();
    /*
    System.out.println("Please enter the sum that you would like to find: ");
    sumToFind = keyboard.nextInt();
    */
    promptInput();
    String result = Arrays.toString(findSum(givenNumbers, sumToFind));
        System.out.println(result);

    }

    public void printIntro(){
        System.out.println("You are given the following array: ");
        System.out.println(Arrays.toString(givenNumbers));
    }
    public int promptInput(){
        System.out.println("Please enter the sum that you would like to find: ");
        return sumToFind = keyboard.nextInt();
    }

    public int[] findSum(int arr[], int numToBeFound){

        HashMap<Integer, Integer> numsInArray = new HashMap<>();
        int answer[] = new int[2];
        for(int i = 0; i < arr.length; i++){
            if(numsInArray.containsKey(numToBeFound - arr[i])){
                answer[0] = numsInArray.get(numToBeFound - arr[i]);
                answer[1] = i;
                break;
            } else{
                numsInArray.put(arr[i],i);
            }
        }
        return answer;
    }

}
