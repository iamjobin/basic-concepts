package com.example;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] ss = s.trim().split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = ss.length-1; i>=0; i--) {
            if(!ss[i].isEmpty()) {
                ans.append(ss[i]).append(" ");

            }
        }
        return ans.substring(0, ans.length() - 1).toString();
    }
}
