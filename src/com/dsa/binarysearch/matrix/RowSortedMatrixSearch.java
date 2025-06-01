package com.dsa.binarysearch.matrix;

import java.util.Arrays;

public class RowSortedMatrixSearch {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3},
                {2, 5}
        };

        System.out.println(Arrays.toString(searchInRowAndColumSorted(arr, 5)));
    }

    private static int[] searchInRowAndColumSorted(int[][] matrix, int target) {
        int length = matrix.length;
        int row = 0;
        int col = matrix[length-1].length - 1;

        while(row<length && col>=0) {
            if (target == matrix[row][col]) {
                return new int[]{row, col};
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        return new int[]{-1, -1,};
    }

//    private static int[] searchInFullySorted(int[][] matrix, int target) {
//        int length = matrix.length;
//        int rs = 0;
//        int re = matrix.length;
//        int cs =0;
//        int ce = matrix[length-1].length - 1;
//
//        while(row<length && col>=0) {
//            int rm = rs + (re-rs)/2;
//            int cm = cs + (ce-cs)/2;
//            if(target == matrix[rm][cm]) {
//                return new int[]{rm, cm};
//            } else if (target > matrix[rm][cm]) {
//                if(cm<ce && rm<re) {
//                    cs = cm+1;
//                    rs = rm;
//                } else if(cm==ce && rm<re) {
//                    rs = rm+1;
//                    cs = 0;
//                }
//            } else {
//                if(cm>cs && rm>rs) {
//                    re = rm;
//                    ce = cm -1;
//                } else if (cm==cs && rm>rs) {
//                    re = rm - 1;
//                    ce = 0;
//                }
//            }
//        }
//
//        return new int[]{-1, -1,};
//
//    }

}
