package com.recursion.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Problem Link : https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class DialPad {

    public static void main(String[] args) {
        pad("", "23");
//        System.out.println((int)'a');
    }

    private static List<String> pad(String p, String up) {
        if (up.isEmpty()) {
            return new ArrayList<>(Collections.singleton(p));
        }
        int digit = up.charAt(0) - '0';
        int range = (digit - 2)  * 3;
        if (digit > 7) {
            range +=1;
        }

        int rangeIter = (digit==7)||(digit==9) ? 4 : 3;

        List<String> list = new ArrayList<>();
        for (int i=range; i<range+rangeIter; i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad(p+ch, up.substring(1)));
        }
        return list;
    }

}
