package com.nt.leetcode;

public class Lt_03_RemoveElement {

	// T(C)=O(n) and S(C)=O(1)
	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int response = removeElement(nums, val);
		System.out.println("The remove element is ::" + response);

	}

}
