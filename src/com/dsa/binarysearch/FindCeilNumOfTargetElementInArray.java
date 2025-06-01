package com.dsa.binarysearch;

public class FindCeilNumOfTargetElementInArray {

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12};
//        int[] nums = {12, 10, 8, 6, 4, 2};
        int target = 1;
        boolean isAsc = nums[0] < nums[nums.length-1];
        System.out.println("Index of ceil value of target : " + ceilValueInArray(nums, target, isAsc));
    }

    /* It will return target element's ceil value index. If target is greater than all elements then it will return -1.
        Target Should there between the start and end or else start will be greater than target.(Basic Logic)
        1. For ceil, use start in asc array.
        2. For floor, use end in asc array.
        Inverse 1, 2 for desc array
    * */
    private static int ceilValueInArray(int[] arr, int target, boolean isAsc) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target == arr[mid]) {
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
        if(arr[start]>target && isAsc) {
            return start;
        } else {
            return end;
        }
    }

}
