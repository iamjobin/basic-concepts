package com.dsa.linearsearch;

import com.dsa.model.SearchResponse;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 15, 10},
                {21, 23, 78},
                {5, 6}
        };
        int target = 5;

        SearchResponse searchResponse = search2D(arr, target);

        if(searchResponse != null) {
            System.out.println("Row : " + searchResponse.getRow());
            System.out.println("Column : " + searchResponse.getColumn());
        } else {
            System.out.println("Not Found.");
        }

    }

    private static SearchResponse search2D(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                int element = arr[row][col];
                if(element == target) {
                    SearchResponse searchResponse = new SearchResponse();
                    searchResponse.setRow(row);
                    searchResponse.setColumn(col);
                    return searchResponse;
                }
            }
        }
        return null;
    }

}
