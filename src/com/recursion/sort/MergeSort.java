package com.recursion.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {4,3,5,2,1};
//        int[] ans = mergeSort(nums);
        mergeSortInPlace(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
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

    private static void mergeSortInPlace(int[] nums, int s, int e) {
        if (e-s == 1) {
           return;
        }
        int m = s + (e-s)/2;
        mergeSortInPlace(nums, s, m);
        mergeSortInPlace(nums, m, e);
        merge(nums, s, m, e);
    }

    private static void merge(int[] nums, int s, int m, int e) {
        int[] merged = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while (i<m && j<e) {
            if (nums[i] < nums[j]) {
                merged[k++] = nums[i++];
            } else {
                merged[k++] = nums[j++];
            }
        }
        while (i<m) {
            merged[k++] = nums[i++];
        }
        while (j<e) {
            merged[k++] = nums[j++];
        }
        for (int l=0; l<k; l++) {
            nums[s++] = merged[l];
        }
    }

}
