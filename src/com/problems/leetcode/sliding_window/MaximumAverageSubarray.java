package com.problems.leetcode.sliding_window;

//Problem Link: https://leetcode.com/problems/maximum-average-subarray-i/
public class MaximumAverageSubarray {

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        int start = 0;
        int end = k;

        while (end < nums.length) {
            sum -= nums[start];
            sum += nums[end];
            start++;
            end++;
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

}
