package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums);

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), result, nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
        return result;
    }

    private static void backtrack(List<Integer> tempList, List<List<Integer>> result, int[] nums) {
        if(tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int num : nums){
            if (tempList.contains(num)) {
                continue;
            }
            tempList.add(num);
            backtrack(tempList, result, nums);
            tempList.removeLast();
        }
    }

}
