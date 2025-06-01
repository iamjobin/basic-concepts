package com.dsa.binarysearch;

//Desc order binary search
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] nums = {354, 100, 44, 9, 2, 0, -9, -89};
        int target = 44;
        System.out.println("Index of target : " + orderAgnosticBinarySearch(nums, target));
    }

    //It will return target element's index. If target is not found then it will return -1.
    private static int  orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int i =0;
        while (start <= end) {
            i++;
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                start = mid + 1;
            } else if(target > arr[mid]) {
                end = mid - 1;
            } else {
                System.out.println("I : " + i);
                return mid;
            }
        }
        return -1;
    }

}
