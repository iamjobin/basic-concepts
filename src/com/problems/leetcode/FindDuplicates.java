package com.problems.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Problem Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println("Repeated Numbers : "+ findDuplicate(nums));
    }

    public static List<Integer> findDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length;
        HashSet<Integer> dups = new HashSet<>();
        while (i<n){
            if(i+1 != nums[i]) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    if(!dups.contains(nums[i])) {
                        dups.add(nums[i]);
                    }
                    i++;
                }
            } else {
                i++;
            }
        }
        return new ArrayList<>(dups);
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
