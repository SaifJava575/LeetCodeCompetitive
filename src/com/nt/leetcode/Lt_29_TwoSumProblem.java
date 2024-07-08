package com.nt.leetcode;

public class Lt_29_TwoSumProblem {

	// T(C)=O(n) and S(C)=O(1)
	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int total = numbers[left] + numbers[right];
			if (total == target)
				return new int[] { left + 1, right + 1 };
			else if (total > target)
				right--;
			else
				left++;
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;

		int response[] = twoSum(numbers, target);
		System.out.println("The target index element of the Sum Element is ");
		for (int i = 0; i < response.length; i++)
			System.out.print(response[i] + " ");

	}

}
