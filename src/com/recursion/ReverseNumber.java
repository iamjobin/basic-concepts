package com.recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(rev(1234, 0));
    }

    public static int rev2(int n) {
        int digits = (int) (Math.log10(n)+1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    private static int rev(int n, int r) {
        if (n==0) {
           return r;
        }
        int digit = n % 10;
        r = (r*10) + digit;
        n /= 10;
        return rev(n, r);
    }

}
