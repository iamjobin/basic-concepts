package com.math;

public class SqrtBS {

    public static void main(String[] args) {
        System.out.printf("%s", sqrt(36, 3));
    }

    private static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root;
        while (s<=e) {
            int m = s + (e-s)/2;
            if (m*m == n) {
                return m;
            } else if (m*m > n) {
                e = m-1;
            } else {
                s = m+1;
            }
        }
        root = e;
        double inc = 0.1;
        for (int i=0; i<p; i++) {
            while (root*root < n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }

}
