package com.dsa.binarysearch;

public class MountainArraySearch {

    public static void main(String[] args) {

        int[] nums = {5,1,3};
//        [5,1,3], [1,3], [6,7,1,2,3,4,5]
        int target = 6;
        System.out.println("Index of target : " + findInMountainArray(nums, target));

    }

    /*
        1. It will return target element in mountain array. If not -1 will be return.
        2. First find the peak element, based on that searching first chunk which is in asc order
           and then searching in second chunk which is in desc order.
        */
    private static int findInMountainArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int peak = findPeakElement(nums);
        int ans = -1;
        if(target == nums[peak]) {
            ans = peak;
        } else {
            ans = binarySearch(nums, target, start, peak, true);
            if(ans == -1) {
                ans = binarySearch(nums, target, peak+1, end, false);
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

    //Leet Code problem, For array we have MountainArray interface.
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        int peak = findPeakElement(mountainArr);
        int ans = -1;
        if(target == mountainArr.get(peak)) {
            ans = peak;
        } else {
            ans = binarySearch(mountainArr, target, start, peak, true);
            if(ans == -1) {
                ans = binarySearch(mountainArr, target, peak, end, false);
            }
        }
        return ans;
    }

    private static int findPeakElement(MountainArray nums) {
        int start = 0;
        int end = nums.length() - 1;

        while (start < end) {
            int mid = start + (end-start)/2;
            if(nums.get(mid) > nums.get(mid+1) ) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    private static int binarySearch(MountainArray arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target == arr.get(mid)) {
                return mid;
            }
            if(isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else if (target > arr.get(mid)) {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else if (target < arr.get(mid)) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}

