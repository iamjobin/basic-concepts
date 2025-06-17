package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Problem Links : https://leetcode.com/problems/subsets/description/, https://leetcode.com/problems/subsets-ii/description/
public class SubSet {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> lists = subsetsWithDup(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : nums){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

//    Sort an array and then if two same elements appear(current and previous are same) then,
//    we have to move the start pointer to end plus one.
//    Because we have already added those, So we are using the previous end value plus one.
    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start;
        int end = 0;
        for (int i=0; i < nums.length; i++){
            int n = outer.size();
            start = 0;
            if (i>0 && nums[i]==nums[i-1]) {
               start = end+1;
            }
            end = n-1;
            for (int j=start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

}
