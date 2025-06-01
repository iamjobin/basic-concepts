package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];

        System.out.println("Enter input for 2D array : ");
        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                arr[row][column] = in.nextInt();
            }
        }

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }

}
