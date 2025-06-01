package com.dsa.binarysearch;

public class MountainArrayPeakElement {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 0, 0};
        System.out.println("Index of peak element : " + findPeakIndex(nums));

    }

    //Using binary search
    private static int findPeakIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) {
                return mid;
            } else if(nums[mid] < nums[mid+1] ) {
                start = mid + 1;
            } else if(nums[mid] < nums[mid-1]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    /*
    Ref: Youtube(kunal)
    1. This will be common for finding peak element in mountain and normal(ZigZag) array.
    */
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1] ) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
}
