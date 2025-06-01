package com.recursion;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    private static boolean isPalindrome(int n) {
        return n == ReverseNumber.rev2(n);
    }

}
