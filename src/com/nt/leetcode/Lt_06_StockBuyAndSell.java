package com.nt.leetcode;

public class Lt_06_StockBuyAndSell {

	// T(C)=O(n) and S(C)=O(1)
	public static int maxProfit(int[] prices) {
		int min_price = prices[0];
		int maxprof = 0;

		for (int i = 1; i < prices.length; i++) {
			maxprof = Math.max(maxprof, prices[i] - min_price);
			min_price = Math.min(prices[i], min_price);
		}

		return maxprof;
	}

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4 };
		int response = maxProfit(prices);
		System.out.println("The max Profit is ::" + response);

	}

}
