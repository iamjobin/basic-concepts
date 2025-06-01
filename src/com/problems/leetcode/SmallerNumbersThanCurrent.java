package com.problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, nums.length);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            int lastIndex = n-1-i;
            int maxIndex = findMaxIndex(nums, 0, lastIndex);
            map.put(nums[maxIndex], lastIndex);
            swap(nums, maxIndex, lastIndex);
        }

        int[] ans = new int[n];

        for (int i=0; i<n; i++) {
            ans[i] = map.get(temp[i]);
        }

        return ans;
    }

    public static int findMaxIndex(int[] nums, int start, int end) {
        int max = nums[start];
        int maxIndex = start;
        for(int i = start+1; i<=end; i++) {
            if(max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
