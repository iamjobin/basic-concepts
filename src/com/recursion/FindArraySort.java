package com.recursion;

import java.util.HashSet;

public class FindArraySort {

    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,2,3}));
    }

    private static HashSet<Integer> set = new HashSet<>();

    private static boolean isSorted(int[] nums) {
        return isSortedHelper(nums, 0);
    }

    private static boolean isSortedHelper(int[] nums, int i) {
        if(i == (nums.length-1)) {
            return true;
        }
        return nums[i] < nums[i+1] && isSortedHelper(nums, i+1);
    }

    private static boolean isUnique(int[] nums) {
        return isUniqueHelper(nums, 0);
    }

    private static boolean isUniqueHelper(int[] nums, int i) {
        if(i>=nums.length) {
            return true;
        }
        if (!set.add(nums[i])) {
            return false;
        }
        return isUniqueHelper(nums, i + 1);
    }

}
