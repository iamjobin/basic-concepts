package com.recursion;

public class Nto1 {

    public static void main(String[] args) {
        funBoth(5);
    }

    private static void fun(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }


    private static void funRev(int n) {
        if(n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    private static void funBoth(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        funBoth(n-1);
        System.out.print(n + " ");
    }

}
