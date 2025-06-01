package com.example;

public class Prime {

    public static void main(String[] args) {
        for (int i=1; i<=20; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "prime" : "not prime"));
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if ((n & 1) == 0) { // even check
            return false;
        }

        // c+2(for odd number only check)
        for (int c = 3; c * c <= n; c += 2) {
            if (n % c == 0) {
                return false;
            }
        }
        return true;
    }


}
