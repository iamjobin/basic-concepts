package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println(findAllInList(new int[]{1,2,2,3}, 2));
    }

    private static int find(int[] nums, int val) {
        return findHelper(nums, val, 0);
    }

    private static int findHelper(int[] nums, int val, int index) {
        if (index == nums.length) {
           return -1;
        }
        if (nums[index] == val) {
           return index;
        }
        return findHelper(nums, val, index+1);
    }

    private static List<Integer> findAllInList(int[] nums, int target) {
        return findAllInListHelper(nums, target, 0);
    }

    private static List<Integer> findAllInListHelper(int[] nums, int target, int i) {
        List<Integer> list = new ArrayList<>();
        if (i == nums.length) {
            return list;
        }
        if (nums[i] == target) {
            list.add(i);
        }
        list.addAll(findAllInListHelper(nums, target, i+1));
        return list;
    }


}
