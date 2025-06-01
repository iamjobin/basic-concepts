package com.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

//Problem Link : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/?envType=problem-list-v2&envId=array
public class MissingNumsInCyclicSort {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println("Missing Number : "+ findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        int itr = 0;
        int n = nums.length;
        while(itr<n) {
            int ci = nums[itr] - 1;
            if(nums[itr] != nums[ci]) {
                swap(nums, itr, ci);
            } else {
                itr++;
            }
        }
        for(int i=0; i<n; i++) {
            if(i+1 != nums[i]) {
                missing.add(i+1);
            }
        }
        return missing;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}