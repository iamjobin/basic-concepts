package com.problems.leetcode;

import java.util.Arrays;

//Problem Link : https://leetcode.com/problems/find-median-from-data-stream/
public class MedianFinder {

    int[] nums;

    int median;

    int size;

    public MedianFinder() {
        nums = new int[100];
        size = 0;
    }

    public void addNum(int num) {
        if(size>=100) {
            int[] updated = new int[size*2];
            System.arraycopy(nums, 0, updated, 0, size);
            nums = updated;
        }
        nums[size] = num;
        size++;
    }

    public double findMedian() {
        int[] updated = new int[size];
        System.arraycopy(nums, 0, updated, 0, size);
        updated = Arrays.stream(updated).sorted().toArray();
        float med;
        int last = size-1;
        if(size%2 == 0) {
            int mid = last/2;
            med =(float) (updated[mid] + updated[mid+1])/2;
        } else {
            med = updated[last/2];
        }
        return med;
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();

        medianFinder.addNum(6);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(10);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(6);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(5);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(0);

        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(6);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(1);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(0);
        System.out.println(medianFinder.findMedian());

        medianFinder.addNum(0);
        System.out.println(medianFinder.findMedian());

    }
}
