package com.nt.leetcode;

public class Lt_13_RotateArray {

	//T(C)=O(n)  and S(C)=O(1)
	public static void reverse(int nums[], int i, int j){
        int li = i;
        int ri = j;
        
        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            
            li++;
            ri--;
        }
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length; 
        if(k < 0){ 
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
	public static void main(String[] args) {
		 int nums[] = {1,2,3,4,5,6,7};
		 int k = 8;
		rotate(nums, k);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");

	}

}
