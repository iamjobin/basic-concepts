package com.recursion.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dice {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        System.out.println(numRollsToTarget(2, 6, 7));
//        dice("", 2);
//        System.out.println(diceList("", 2));
    }

    private static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=6 && i<=target ; i++) {
            dice(p + i, target-i);
        }
    }

    private static List<String> diceList(String p, int target) {
        if (target == 0) {
            return new ArrayList<>(Collections.singleton(p));
        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            list.addAll(diceList(p + i, target-i));
        }
        return list;
    }

    public static int numRollsToTarget(int n, int k, int target) {
        if (n == 0) {
            return target == 0 ? 1 : 0;
        }
        int count = 0;
        for (int i = 1; i <= k && i <= target; i++) {
            count = (count + numRollsToTarget(n-1, k, target-i)) % MOD;
        }
        return count;
    }

}
