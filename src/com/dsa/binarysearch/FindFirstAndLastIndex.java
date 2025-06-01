package com.dsa.binarysearch;

import java.util.Arrays;

public class FindFirstAndLastIndex {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 10;
        System.out.println("Index of target : " + Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        return new int[] {first, last};
    }

    //based on the isFindFlag it will return the index of the target element
    private static int search(int[] arr, int target, boolean isFindFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(isFindFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
