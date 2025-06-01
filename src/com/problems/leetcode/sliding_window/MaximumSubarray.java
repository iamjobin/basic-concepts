package com.problems.leetcode.sliding_window;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int n = nums.length;
        int currentMax = nums[0];
        int maxSoFar = currentMax;
        for (int i=1; i<n; i++) {
            currentMax = Math.max(nums[i], nums[i]+currentMax);
            maxSoFar = Math.max(currentMax, maxSoFar);
        }
        return maxSoFar;
    }

}
