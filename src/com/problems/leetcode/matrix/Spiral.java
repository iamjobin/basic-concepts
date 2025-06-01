package com.problems.leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

// Problem Link : https://leetcode.com/problems/spiral-matrix/description/
public class Spiral {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(mat));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralOrder = new ArrayList<>();

        int top = 0; int bottom = matrix.length-1;
        int left = 0; int right = matrix[0].length-1;

        while (top<=bottom && left<=right) {

            // left 2 right
            for (int i=left; i<=right; i++) {
               spiralOrder.add(matrix[top][i]);
            }
            top++;

            //top 2 bottom
            for (int i=top; i<=bottom; i++) {
                spiralOrder.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                //right 2 left
                for (int i = right; i >= left; i--) {
                    spiralOrder.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                //bottom 2 top
                for (int i = bottom; i >= top; i--) {
                    spiralOrder.add(matrix[i][left]);
                }
                left++;
            }
        }

        return spiralOrder;
    }

}
