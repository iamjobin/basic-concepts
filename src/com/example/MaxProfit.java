package com.example;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {1, 3, 5, 2, 8, 9};
        int maxProfit = maxProfit(prices);
        System.out.println("Max Profit : "+ maxProfit);
    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int maxProfit = 0;
        int maxEl = prices[prices.length-1];
        for(int i = prices.length-2; i>=0; i--) {
            if(prices[i] < maxEl){
                int profit = maxEl - prices[i];
                if(profit>maxProfit) {
                    maxProfit = profit;
                }
            } else {
                maxEl = prices[i];
            }
        }
        return maxProfit;
    }


}
