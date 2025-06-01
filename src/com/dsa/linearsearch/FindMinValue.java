package com.dsa.linearsearch;

public class FindMinValue {

    public static void main(String[] args) {
        int[] nums = {10, 12, 13, 14, 15};
        int minValue = min(nums);
        if(minValue == -1 ) {
            System.out.println("Array size was zero.");
        } else {
            System.out.println("Minimum value in the given array : " + minValue);
        }
    }

    private static int min(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }
        int target = nums[0];
        for(int index=0; index<nums.length; index++) {
            int element = nums[index];
            if(element < target){
                target = element;
            }
        }
        return target;
    }

}
