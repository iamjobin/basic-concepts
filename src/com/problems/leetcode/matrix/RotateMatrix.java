package com.problems.leetcode.matrix;

import java.util.Arrays;

// Problem Links :
// 1. https://leetcode.com/problems/rotate-image/description/
// 2. https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
        rotate90(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

//    Compares two matrices for equality. If they are not the same, rotate the matrix (mat) by 90 degrees and repeat the comparison until a full rotation is completed.
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int i = 0; i<4; i++) {
            if (hasEqual(mat, target, n)) { return true; }
            rotate90(mat);
        }
        return false;
    }

//    Rotates a matrix by 90 degrees
    public static void rotate90(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix, n);
        reverseRows(matrix, n);
    }

    private static void transpose(int[][] matrix, int n) {
        for (int i = 0; i< n; i++) {
            for (int j = i; j< n; j++) {
                if (i!=j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }

    private static void reverseRows(int[][] matrix, int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

    private static boolean hasEqual(int[][] mat, int[][] target, int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
