package com.problems.leetcode;

//Problem Link: https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println("Repeated Number : "+ findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i<n){
            if(i+1 != nums[i]) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return n;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
