package com.dsa.linearsearch;

public class FindMaxIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 15, 10},
                {21, 23, 78},
                {5, 6}
        };

        int max = findMax(arr);
        System.out.println("Max value in the given Array : " + max);

    }

    private static int findMax(int[][] arr) {
        int max = arr[0][0];
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                int element = arr[row][col];
                if(element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
