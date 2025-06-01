package com.dsa.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-89, -9, 0, 2, 9, 44, 100, 354};
        int target = 2;
        System.out.println("Index of target : " + binarySearch(nums, target));
    }

    //It will return target element's index. If target is not found then it will return -1.
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // for both order
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

}
