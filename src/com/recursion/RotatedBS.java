package com.recursion;

public class RotatedBS {

    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3,4};
        System.out.println(search(nums, 10, 0,  nums.length-1));
    }

    private static int search(int[] nums, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[start] <= nums[mid]) {
            if (target <= nums[mid] && target >= nums[start]) {
                return search(nums, target, start, mid - 1);
            } else {
                return search(nums, target, mid + 1, end);
            }
        } else {
            if (target >= nums[mid] && target <= nums[end]) {
                return search(nums, target, mid + 1, end);
            } else {
                return search(nums, target, start, end - 1);
            }
        }
    }

}
