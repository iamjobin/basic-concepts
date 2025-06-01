package com.problems.leetcode.sliding_window;

public class MaximumProductSubarray {

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    private static int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int max = nums[0];
        for (int i=0; i<n; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;
            leftProduct *= nums[i];
            rightProduct *= nums[n-1-i];
            max = Math.max(max, Math.max(leftProduct, rightProduct));
        }
        return max;
    }

}
