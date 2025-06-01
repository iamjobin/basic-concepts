package com.problems.leetcode;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println("Is Happy Numer : " + isHappy(2));
    }

    public static boolean isHappy(int n) {
        int sumOfN = n;
        int i = 0;
        do {
            sumOfN = findSquareSum(sumOfN);
            i++;
        } while (sumOfN != 1 && i != 5);

        if(sumOfN == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static int findSquareSum(int n) {
        int sumOfN = 0;
        while(n >= 10) {
            int last;
            last = n % 10;
            sumOfN += last * last;
            n = n/10;
        }
        sumOfN += n * n;
        return sumOfN;
    }

}
