package com.example;


import java.util.Arrays;

//Problem Link : https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
public class RotatingAnArray {

    public static void main(String[] args) {
        int[] nums = {1,2};
        rotate(nums, 3);
        System.out.println("Rotated Array : "+ Arrays.toString(nums));
    }

    //O(N*N) -- Not works well for some cases
    public static void rotate(int[] nums, int k) {
        int loopMax = k;
        for(int i = 0; i < loopMax; i++) {
            if(k>0){
                insertion(nums);
                k--;
            } else {
                break;
            }
        }
    }

    private static void insertion(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            int temp = nums[i+1];
            nums[i+1] = nums[0];
            nums[0] = temp;
        }
    }

    //O(N)
    public void rotateUsingReverse(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k > n
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
