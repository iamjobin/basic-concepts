package com.math;

public class Power {

    public static void main(String[] args) {
        System.out.println(power(121, 2));
    }

    private static int power(int base, int power) {
        int ans = 1;
        while (power>0) {
            if ((power&1) == 1) {
                ans *= base;
            }
            base *= base;
            power = power>>1;
        }
        return ans;
    }

}