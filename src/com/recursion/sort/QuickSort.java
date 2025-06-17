package com.recursion.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {4,3,5,1,2};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int start = low, end = high, mid = start + (end-start)/2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
//            ensure to check before swap, it may start cross the end.
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(nums, start, high);
        quickSort(nums, low, end);
    }

}
