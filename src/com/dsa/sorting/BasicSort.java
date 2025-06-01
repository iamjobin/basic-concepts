package com.dsa.sorting;

import java.util.Arrays;

public class BasicSort {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        selectionSort(nums);
        System.out.println("Sorted Array : "+ Arrays.toString(nums));
    }

    private static void insertionSort(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(nums[j]<nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    private static void selectionSort(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int lastIndex = nums.length-1-i;
            int maxIndex = getMaxIndex(nums, 0, lastIndex);
            swap(nums, maxIndex, lastIndex);
        }
    }

    private static void bubbleSort(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            boolean isSwapped = false;
            for(int j=0; j< nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]) {
                    isSwapped = true;
                    swap(nums, j, j+1);
                }
            }
            if(!isSwapped) {
                break;
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    private static int getMaxIndex(int[] nums, int start, int last) {
        int maxIndex= start;
        for(int i=start+1; i<=last; i++) {
            if(nums[i]>nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
