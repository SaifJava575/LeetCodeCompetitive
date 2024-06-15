package com.nt.leetcode;

import java.util.Arrays;

public class Lt_22_CandyProblem {

	public static int candy(int[] ratings) {
		int n = ratings.length;
		int[] candies = new int[n];
		Arrays.fill(candies, 1);

		for (int i = 1; i < n; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			}
		}

		for (int i = n - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i], candies[i + 1] + 1);
			}
		}

		int totalCandies = 0;
		for (int candy : candies) {
			totalCandies += candy;
		}

		return totalCandies;
	}

	public static void main(String[] args) {
		int ratings[] = { 1, 2, 2 };
		int response = candy(ratings);
		System.out.println("The Candy distribution is :: " + response);

	}

}
