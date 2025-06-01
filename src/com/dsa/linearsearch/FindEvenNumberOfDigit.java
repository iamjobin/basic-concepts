package com.dsa.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FindEvenNumberOfDigit {

    /* Problem : Declare a array nums of integers,
    return how many of them contain an even number of digits/ return those values alone. */
    public static void main(String[] args) {
        int[] nums = {101, 1, 345, 6, 7890, 29876, 1245};
        ArrayList<Integer> evenNums = findEvenDigits(nums);
        System.out.println(Arrays.toString(evenNums.toArray()));
        System.out.println("Count of even numbers in the given arra : " + evenNums.size());
    }

    private static ArrayList<Integer> findEvenDigits(int[] nums) {
        ArrayList<Integer> evenDigits = new ArrayList<>();
        for(int num : nums) {
            if(isEvenDigit(num)){
                evenDigits.add(num);
            }
        }
        return evenDigits;
    }

    private static boolean isEvenDigit(int num) {
        int digitCount=findDigitCount(num);
        return digitCount % 2 == 0;
    }

    private static int findDigitCount(int num) {
        if(num == 0){
            return 1;
        }
        if(num<0) {
            num = num * -1;
        }

        int digitCount=0;
        while (num>0) {
            digitCount++;
            num = num / 10;
        }
        return digitCount;
    }

}
