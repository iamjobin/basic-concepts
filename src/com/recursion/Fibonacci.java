package com.recursion;

//Problem Link : https://leetcode.com/problems/fibonacci-number/description/
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibo(3));
    }
    public static int findFibo(int n) {
        if(n<2) return n;
        return findFibo(n-1) + findFibo(n-2);
    }
}
