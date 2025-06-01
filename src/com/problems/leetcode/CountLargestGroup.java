package com.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

//Problem Link: https://leetcode.com/problems/count-largest-group/description/
public class CountLargestGroup {

    public static void main(String[] args) {
        System.out.println(countLargestGroup(15));
    }

    public static int countLargestGroup(int n) {
        Map<Integer, Integer> digitSumMap = new HashMap<>();
        int maxFrequency = 0;

        for (int i = 1; i <= n; i++) {
            int digitSum = getDigitSum(i);
            int frequency = digitSumMap.getOrDefault(digitSum, 0) + 1;
            digitSumMap.put(digitSum, frequency);
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        int count = 0;
        for (int freq : digitSumMap.values()) {
            if (freq == maxFrequency) {
                count++;
            }
        }

        return count;
    }

    public static int getDigitSum(int n) {
        int sum = 0;
        while (n>0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
