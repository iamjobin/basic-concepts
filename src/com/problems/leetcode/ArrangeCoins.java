package com.problems.leetcode;

public class ArrangeCoins {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
    public static int arrangeCoins(int n) {
        long start = 1, end = n;

        while (start<=end) {
            long mid = start + (end-start)/2;
            long coins = (mid * (mid+1)) / 2;
            if (coins == n) {
                return (int)mid;
            }
            if (coins > n) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return (int)end;
    }

}
