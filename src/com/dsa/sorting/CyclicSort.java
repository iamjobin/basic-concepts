package com.dsa.sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        cycleSort(nums);
        System.out.println("Sorted Array : "+ Arrays.toString(nums));
    }

    private static void cycleSort(int[] nums) {
        int i = 0;
        while (i<nums.length){
           int correctIndex = nums[i]-1;
           if(nums[i] != nums[correctIndex]) {
               swap(nums, i, correctIndex);
           } else {
               i++;
           }
       }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}