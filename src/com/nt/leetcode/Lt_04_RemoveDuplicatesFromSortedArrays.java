package com.nt.leetcode;

public class Lt_04_RemoveDuplicatesFromSortedArrays {

	public static int removeDuplicates(int[] nums) {
		int index = 1;
		int occurance = 1;

		// T(C)=O(n) and S(c)=O(1)
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) 
				occurance++;
			 else 
				occurance = 1;

			if (occurance <= 2) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1, 2, 2, 3 };
		int response = removeDuplicates(nums);
		System.out.println("The Remove Duplicate Element is ::" + response);

	}

}
