package com.recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sum(1243));
    }

    private static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return sum(n/10) + (n%10);
    }

//    stack overflow by --
    private static void fun(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        fun(--n);
    }

}
