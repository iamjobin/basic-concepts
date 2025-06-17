package com.recursion.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
//        permutations("", "abc");
        System.out.println(permutationsList("", "abc"));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            permutations(f+ch+s, up.substring(1));
        }
    }

    static List<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            return new ArrayList<>(Collections.singleton(p));
        }
        char ch = up.charAt(0);

        List<String> list = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            list.addAll(permutationsList(f+ch+s, up.substring(1)));
        }
        return list;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count = count + (permutationsCount(f+ch+s, up.substring(1)));
        }
        return count;
    }

}
