package com.problems.leetcode;

//Problem Link : https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianSortedArrays {

    public static void main(String[] args) {
        int[] a1 = {2};
        int[] a2 = {};
        System.out.println(findMedianSortedArrays(a1, a2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] merged = new int[nums1.length+nums2.length];
            int k=0; int i=0; int j=0;
            while (i<nums1.length || j<nums2.length) {
                if(i>=nums1.length) {
                    merged[k++] = nums2[j++];
                    continue;
                }
                if(j>=nums2.length) {
                    merged[k++] = nums1[i++];
                    continue;
                }
                if(nums1[i] < nums2[j]) {
                    merged[k++] = nums1[i++];
                } else {
                    merged[k++] = nums2[j++];
                }
            }

            int n = merged.length;
            if(n%2 == 0) {
                return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
            } else {
                return merged[n / 2];
            }

    }

}

