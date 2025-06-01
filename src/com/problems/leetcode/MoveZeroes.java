package com.problems.leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        moveZeroes(new int[]{4,2,4,0,0,3,0,5,1,0});
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==1) {
            return;
        }
        int one = 0, two = 1;
        while (two<n) {

            if (nums[two] != 0) {
                if (nums[one]==0) {
                    int temp = nums[one];
                    nums[one] = nums[two];
                    nums[two] = temp;
                } else {
                    int temp = nums[one+1];
                    nums[one+1] = nums[two];
                    nums[two] = temp;
                }
                one++;
            }
            two++;
        }
        System.out.println(Arrays.toString(nums));
    }

}
