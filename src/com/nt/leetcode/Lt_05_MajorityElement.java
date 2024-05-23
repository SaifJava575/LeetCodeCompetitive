package com.nt.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lt_05_MajorityElement {

	// Sorting Approach T(c)=O(n)
	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		return nums[n / 2];
	}

	// Approach 2: Hash Map T(c)=O(n)
	public static int majorityElement1(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++)
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

		n = n / 2;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > n) {
				return entry.getKey();
			}
		}

		return 0;
	}

	// Approach 3: Moore Voting Algorithm
	public static int majorityElement2(int[] nums) {
		int count = 0;
		int candidate = 0;

		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}

			if (num == candidate) {
				count++;
			} else {
				count--;
			}
		}

		return candidate;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		int response = majorityElement(nums);
		System.out.println("The majority Element is ::" + response);
	}

}
