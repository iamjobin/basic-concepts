package com.problems.leetcode;

//Problem Link: https://leetcode.com/problems/total-characters-in-string-after-transformations-i/description/
public class LengthAfterTransformation {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        System.out.println(lengthAfterTransformations("azbk",28));
    }

    public static int lengthAfterTransformations(String s, int t) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }

        for (int i = 0; i<t; i++) {
            int[] nxtFreq = new int[26];
            for (int j=0; j<26; j++) {
                int count = freq[j];
                if (j == 25) {
                    nxtFreq[0] +=count;
                    nxtFreq[1] +=count;
                } else {
                    nxtFreq[j+1] += count;
                }
            }
            freq = nxtFreq;
        }

        int totalLength = 0;
        for (int count : freq) {
            totalLength += count;
        }

        return totalLength;
    }

//    Optimised version for leet code cases:
    public int lengthAfterTransformationsLCV(String s, int t) {
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
