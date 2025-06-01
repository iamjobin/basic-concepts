package com.math;

public class FindUniqInArray2 {

    public static void main(String[] args) {
        System.out.println(find(new int[]{2,3,2,2,7,8,7,8,8,7}));
    }

    private static int find(int[] nums) {
        int ans = 0;
        int[] setCounts = new int[8];
        for (int i = 0; i<8; i++) {
            int lastSum = 0;
            for (int j=0; j< nums.length; j++) {
                lastSum += nums[j] & 1;
                nums[j] = nums[j]>>1;
            }
            setCounts[i] = lastSum;
        }
        for (int c : setCounts) {
            ans += c;
        }
        return ans%3;
    }

}
