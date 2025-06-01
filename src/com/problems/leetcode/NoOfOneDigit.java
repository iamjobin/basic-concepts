package com.problems.leetcode;

//Problem Link : https://leetcode.com/problems/number-of-digit-one/
public class NoOfOneDigit {

    public static void main(String[] args) {
        System.out.println(countDigitOne(824883294));

    }

    public static int countDigitOne(int n) {
        int count = 0;

        int it = 1;
        if(n > 100000000) {
            count = 80000001;
            it = 100000001;
        }
        for (int i=it; i<=n; i++) {
            int newN = i;
            while (newN>0) {
                if(newN%10 == 1) {
                    count++;
                }
                newN = newN/10;
            }
        }

        return count;
    }

}
