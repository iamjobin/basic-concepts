package com.dsa.linearsearch;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class FindMaxSumIn2D {

    public static void main(String[] args) {

        int[][] arr = {{5, 8, 1}, {3, 13}, {1, 15}};
        findMaxSum(arr);
        System.out.println(findMaxSum(arr));
    }

    private static Map<Integer, Integer> findMaxSum(int[][] nums) {
        Map<Integer, Integer> maxSumMap = new HashMap<>();
        int maxSum=0;
        for(int i=0; i<nums.length; i++) {
            int sum = calSum(nums[i]);
            if(maxSum < sum) {
                maxSumMap.clear();
                maxSum = sum;
                maxSumMap.put(i, sum);
            }
            else if (maxSum == sum ) {
                maxSumMap.put(i, sum);
            }
        }
        return maxSumMap;
    }

    private static int calSum(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum+=num;
        }
        return sum;
    }

}
