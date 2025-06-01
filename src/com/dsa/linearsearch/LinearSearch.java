package com.dsa.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        int targetIndex = linearSearch(nums, target);
        if(targetIndex == -1 ) {
            System.out.println("Target was not found in the given array.");
        } else {
            System.out.println("Target was found in index : " + targetIndex);
        }
    }

    private static int linearSearch(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }
        for(int index=0; index<nums.length; index++) {
            int element = nums[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
