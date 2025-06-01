package com.dsa.binarysearch;

public class InfiniteArraySearch {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 7, 9, 11, 13, 15, 17, 19, 21, 25, 30};
        int target = 21;
        System.out.println("Index of target : " + findStartAndEnd(nums, target));
    }

    // have to retry this, not properly done
    private static int findStartAndEnd(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int temp = end + 1;
            // previous end + size of the box * (Double)
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(nums, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]) {
               end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
