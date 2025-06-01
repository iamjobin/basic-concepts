package com.problems.leetcode;

import java.util.Arrays;

//Problem Link: https://leetcode.com/problems/flipping-an-image/description/
public class FlipImage {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}})));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] im : image) {
            int n = im.length;
            for(int i=0; i<=(n-1)/2; i++) {
                int temp = im[i] ^ 1;
                im[i] = im[n-1-i] ^ 1;
                im[n-1-i] = temp;
            }
        }
        return image;
    }

}
