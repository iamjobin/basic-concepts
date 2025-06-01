package com.problems.leetcode.anagram;

//Problem Link: https://leetcode.com/problems/valid-anagram/
public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "aa"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26]; // Only lowercase English letters

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }


}
