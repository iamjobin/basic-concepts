package com.problems.leetcode.sliding_window;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int right = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                maxLength = Math.max(maxLength, (right-left + 1));
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
               builder.append(ch);
            }
        }

        int left = 0;
        int right = builder.length()-1;
        while (left < right) {
            if (builder.charAt(left) != builder.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
