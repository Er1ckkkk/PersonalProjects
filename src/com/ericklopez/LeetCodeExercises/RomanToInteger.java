package com.ericklopez.LeetCodeExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    Scanner keyboard = new Scanner(System.in);
    String input = "";

    public void performRomanToInteger() {
        promptForInput();
        conversionToInteger();
        performRomanToInteger();

    }

    public void promptForInput() {
        System.out.println("Please enter in any roman numeral you that would like to be converted: ");
        input = keyboard.nextLine();
    }

    public void conversionToInteger() {
        int result = 0;
        //putting given values into a hashmap
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < input.length(); i++) {

            //if the character A is less than character B it means you have to subtract..
            //e.g. IV --> 1 and 5 so subtract --> 5 - 1 = 4
            //else add to result normal
            if (i < input.length() - 1 && map.get(input.charAt(i)) < map.get(input.charAt(i + 1))) {
                result += map.get(input.charAt(i + 1)) - map.get(input.charAt(i));
                i++;
            } else {
                result += map.get(input.charAt(i));
            }
        }
        System.out.println(result);
    }
}
