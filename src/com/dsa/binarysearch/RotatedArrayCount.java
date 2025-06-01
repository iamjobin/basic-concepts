package com.dsa.binarysearch;

public class RotatedArrayCount {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3,};
        System.out.println("Rotation count : "+findRotationCount(nums));
    }

    //find rotation count in rotated array.
    private static int findRotationCount(int[] nums) {
        int pivotIndex = findPivot(nums);
        if(pivotIndex == -1) {
            return 0;
        } else {
            return pivotIndex + 1;
        }
    }

    private static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[end] && nums[mid] > nums[mid + 1]){
                return  mid;
            }
            if(mid>0 && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if(nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

//    public void rotate(int[] nums, int k) {
//        List<Integer> list = new ArrayList<>();
//        for(int i=nums.length-1; i>=nums.length-1-k; i--) {
//            list.add(nums[i]);
//        }
//        nums= (int[]) list.toArray();
//    }

}
