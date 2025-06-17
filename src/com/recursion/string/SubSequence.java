package com.recursion.string;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public static void main(String[] args) {
//        subSeq("", "abc");
        System.out.println(subSeqAscii("", "abc"));
    }

    private static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    private static List<String> subSeqRet(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> added = subSeqRet(p+ch, up.substring(1));
        List<String> skipped = subSeqRet(p, up.substring(1));
        added.addAll(skipped);
        return added;
    }

    private static List<String> subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> added = subSeqAscii(p+ch, up.substring(1));
        List<String> skipped = subSeqAscii(p, up.substring(1));
        List<String> ascii = subSeqAscii(p+((int)ch), up.substring(1));
        added.addAll(skipped);
        added.addAll(ascii);
        return added;
    }
}
