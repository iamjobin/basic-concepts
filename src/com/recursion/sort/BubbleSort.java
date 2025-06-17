package com.recursion.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {4,3,5,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums) {
        if(nums.length<2) {
            return;
        }
        sortHelper(nums, 0, nums.length-1);
    }

    private static void sortHelper(int[] nums, int index, int end) {
        if (end < 0) {
            return;
        }
        if (index < end) {
            if (nums[index] > nums[index+1]) {
                int temp = nums[index];
                nums[index] = nums[index+1];
                nums[index+1] = temp;
            }
            sortHelper(nums, index+1, end);
        } else {
            sortHelper(nums, 0, end-1);
        }
    }

}
