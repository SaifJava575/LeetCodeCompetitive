package com.nt.leetcode;

import java.util.Arrays;

public class Lt_16_ProductOfArray {

	// 1.Brute Force Approach T(C)=O(N^2) and S(C)=O(1)
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int ans[] = new int[n];

		for (int i = 0; i < n; i++) {
			int pro = 1;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				pro *= nums[j];
			}
			ans[i] = pro;
		}

		return ans;
	}

	// 2. Dividing the product of array with the number
	public static int[] productExceptSelf1(int[] nums) {
		int n = nums.length;
		int ans[] = new int[n];
		int pro = 1;
		for (int i : nums) {
			pro *= i;
		}

		for (int i = 0; i < n; i++) {
			ans[i] = pro / nums[i];
		}
		return ans;
	}

	// 3. Finding Prefix Product and Suffix Product
	public static int[] productExceptSelf2(int[] nums) {
		int n = nums.length;
		int pre[] = new int[n];
		int suff[] = new int[n];
		pre[0] = 1;
		suff[n - 1] = 1;

		for (int i = 1; i < n; i++) {
			pre[i] = pre[i - 1] * nums[i - 1];
		}
		for (int i = n - 2; i >= 0; i--) {
			suff[i] = suff[i + 1] * nums[i + 1];
		}

		int ans[] = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = pre[i] * suff[i];
		}
		return ans;
	}

	// 4. Directly store the product of prefix and suffix into the final answer
	// array
	public static int[] productExceptSelf3(int[] nums) {
		int n = nums.length;
		int ans[] = new int[n];
		Arrays.fill(ans, 1);
		int curr = 1;
		for (int i = 0; i < n; i++) {
			ans[i] *= curr;
			curr *= nums[i];
		}
		curr = 1;
		for (int i = n - 1; i >= 0; i--) {
			ans[i] *= curr;
			curr *= nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4};
		int ans[] = productExceptSelf3(nums);
		System.out.println("Product Of the Array is ::");
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");

	}

}
