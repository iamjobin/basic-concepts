package com.dsa.binarysearch;

public class FindCeilCharacterInArray {

    public static void main(String[] args) {
        char[] nums = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println("Index of ceil value of target : " + nextGreatestLetter(nums, target));
    }

    private static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        if(target >= arr[end]) {
            return arr[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid] || arr[mid] == arr[mid+1]) {
                start = mid + 1;
            } else if (target == arr[mid] ) {
                return arr[mid+1];
            }
        }

        return arr[start];

    }

    //Using modulo(Youtube ref)
    private static char nextGreatestLetterKunal(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid] || arr[mid] == arr[mid+1]) {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];

    }

}
