package com.math;

public class MagicNumber {

    public static void main(String[] args) {
        System.out.println(magicNum(7));
    }

    private static int magicNum(int n) {
        int ans = 0;
        int base = 5;

        while (n>0) {
            int last = n & 1;
            n = n >> 1;
            ans += last*base;
            base = base * 5;
        }
        return ans;
    }
}
