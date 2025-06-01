package com.math;

public class FindUniqInArray {

    public static void main(String[] args) {
        System.out.println(find(new int[]{1,3,2,6,4,3,4,2,1}));
    }

    private static int find(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^=num;
        }
        return ans;
    }

}
