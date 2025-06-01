package com.problems.leetcode;

import java.util.Arrays;

//Problem Link : https://leetcode.com/problems/plus-one/
public class PlusOneInArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,8,9})));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 0;
        for (int i= n-1; i>-1; i--) {
            if(carry != 0 || i == n-1) {
                if(digits[i] == 9) {
                    carry = 1;
                    digits[i] = 0;
                } else {
                    carry = 0;
                    digits[i] +=1;
                }
            }
        }
        if (carry != 0) {
            int[] updated = new int[n+1];
            System.arraycopy(digits, 0, updated, 1, digits.length);
            updated[0] = carry;
            digits = updated;
        }
        return digits;

    }

}
