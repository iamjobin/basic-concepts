package com.recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {4,3,5,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums) {
        sortHelper(nums, nums.length-1);
    }

    private static void sortHelper(int[] nums, int end) {
        if (end < 0) { return; }

        int maxIndex = findMaxIndex(nums, 0, end);
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[end];
        nums[end] = temp;

        sortHelper(nums, end-1);
    }

    private static int findMaxIndex(int[] nums, int start, int end) {
        if (start==end) {
            return start;
        }
        int maxIndex = findMaxIndex(nums, start+1, end);
        return nums[maxIndex] > nums[start] ? maxIndex : start;
    }

}
