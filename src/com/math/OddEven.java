package com.math;

public class OddEven {

    public static void main(String[] args) {
        System.out.println(isEven(1));
    }

    private static boolean isEven(int n) {
        return (n & 1) != 1;
    }
}
