package com.problems.leetcode.anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int f : freq) {
                sb.append(f).append("#");
            }
            String key = sb.toString();
            map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
