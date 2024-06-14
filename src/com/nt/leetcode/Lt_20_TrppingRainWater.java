package com.nt.leetcode;

public class Lt_20_TrppingRainWater {

	public static int trap(int[] h) {
		int l = 0, r = h.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
		while (l < r) {
			lmax = Math.max(lmax, h[l]);
			rmax = Math.max(rmax, h[r]);
			ans += (lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
		}
		return ans;
	}

	public static void main(String[] args) {
		int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int response = trap(height);
		System.out.println("The total Trapping rain water is ::" + response);
	}

}
