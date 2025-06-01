package com.recursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {4,3,5,2,1};
        int[] ans = mergeSort(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int i =0, j=0, k = 0;
        int[] merged = new int[left.length + right.length];
        while (i<left.length && j<right.length) {
            if (left[i] < right[j]) {
               merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        //In some cases it may be left/right array not be traversed fully.
        while (i < left.length) {
            merged[k++] = left[i++];
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }
       return merged;
    }

}
