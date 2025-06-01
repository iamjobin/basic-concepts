package com.math;

public class NoOfDigits {

    public static void main(String[] args) {
        System.out.println(findDigitsByBase(10, 2));
    }

    private static int findDigitsByBase(int num, int base) {
        return (int) (Math.log(num) / Math.log(base)) + 1;
    }

}
