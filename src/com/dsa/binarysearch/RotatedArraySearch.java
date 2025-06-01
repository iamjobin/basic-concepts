package com.dsa.binarysearch;

public class RotatedArraySearch {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
//        [5,1,3], [1,3], [6,7,1,2,3,4,5], [4,5,6,7,8,1,2,3}]
        int target = 3;
        System.out.println("Index of target : " + findInRotatedArray(nums, target));

    }

    /*
        1. It will return target element in rotated array. If not -1 will be return.
        2. First find the peak element, based on that searching first chunk which is in asc order
           and then searching in second chunk which is in asc order.
        */
    private static int findInRotatedArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int peak = findPeakElement(nums);
        System.out.println("Peak Index : "+ peak);
//        System.out.println("Peak Element : "+ nums[peak]);
        int ans = -1;

        if(peak == -1) {
            return binarySearch(nums, target, start, end, true);
        }
        if(nums[peak] == target) {
            return peak;
        } else {
            ans = binarySearch(nums, target, start, peak, true);
            if (ans == -1 && peak<end) {
                ans = binarySearch(nums, target, peak + 1, end, true);
            }
        }

        return ans;
    }

    private static int binarySearch(int[] arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target == arr[mid]) {
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    private static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[end] && nums[mid] > nums[mid + 1]){
                return  mid;
            }
            if(mid>0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if(nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

}

