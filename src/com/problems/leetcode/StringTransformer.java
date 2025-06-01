package com.problems.leetcode;

public class StringTransformer {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        String s = "az";
        int t = 1;
        System.out.println(transformedLength(s, t));
    }

    public static int transformedLength(String s, int t) {
        int[] count = new int[26];

        // Initialize count of each character in the input string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Perform t transformations
        for (int step = 0; step < t; step++) {
            int[] nextCount = new int[26];

            // For 'a' to 'y'
            for (int i = 0; i < 25; i++) {
                nextCount[i + 1] = (nextCount[i + 1] + count[i]) % MOD;
            }

            // For 'z' → 'a' and 'b'
            nextCount[0] = (nextCount[0] + count[25]) % MOD;
            nextCount[1] = (nextCount[1] + count[25]) % MOD;

            count = nextCount;
        }

        // Sum up the total length of the final string
        long result = 0;
        for (int c : count) {
            result = (result + c) % MOD;
        }

        return (int) result;
    }

}
