package com.nt.leetcode;

public class Lt_12_JumpsGame2 {

	// T(C)=O(n) and S(C)=O(1)
	public static int jump(int[] nums) {
		int ans = 0;
		int end = 0;
		int farthest = 0;

		for (int i = 0; i < nums.length - 1; ++i) {
			farthest = Math.max(farthest, i + nums[i]);
			if (farthest >= nums.length - 1) {
				++ans;
				break;
			}
			if (i == end) { // Visited all the items on the current level
				++ans; // Increment the level
				end = farthest; // Make the queue size for the next level
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 3, 0, 1, 4 };
		int response = jump(nums);
		System.out.println("The minimum Jump Required ::" + response);

	}

}
