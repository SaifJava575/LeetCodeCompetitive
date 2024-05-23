package com.nt.leetcode;

public class LTt_07_BuyStockProblem11 {

	// T(C)=O(n) and s(c)=o(1)
	public static int maxProfit(int[] prices) {
		int profitFromPriceGain = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				profitFromPriceGain += (prices[i + 1] - prices[i]);
			}
		}
		return profitFromPriceGain;

	}

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4 };
		int response = maxProfit(prices);
		System.out.println("The max profit is ::" + response);
	}

}
