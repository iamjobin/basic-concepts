package com.problems.leetcode;

//Problem Link : https://leetcode.com/problems/missing-number/
public class MissingNumInCyclicSort {

    public static void main(String[] args) {
        int[] nums = {3,0,1};

        System.out.println("Missing Number : "+ missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i<n){
            int correctIndex = nums[i];
            if(correctIndex<n &&nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for(int index=0; index<n; index++) {
            if(nums[index]!=index) {
                return index;
            }
        }
        return n;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}