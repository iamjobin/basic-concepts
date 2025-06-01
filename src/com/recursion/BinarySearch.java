package com.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 10, 20, 30, 50, 66};
        System.out.println(search(nums, 20, 0, nums.length-1));
    }

    public static int search(int[] nums, int target, int s, int e) {
        if (s>e) {
            return -1;
        }
        int m = s + (e-s)/2;
        if (nums[m] == target) {
            return m;
        } else if (nums[m]<target) {
            return search(nums, target, m+1, e);
        }
        return search(nums, target, s, m-1);
    }
}
