package com.nt.leetcode;

import java.util.Arrays;

public class Lt_23_LongestCommonPrefix {

	//T(C)=O(N)  and S(C)=O(1)
	 public static String longestCommonPrefix(String[] strs) {
		 Arrays.sort(strs);
	        String s1 = strs[0];
	        String s2 = strs[strs.length-1];
	        int idx = 0;
	        while(idx < s1.length() && idx < s2.length()){
	            if(s1.charAt(idx) == s2.charAt(idx)){
	                idx++;
	            } else {
	                break;
	            }
	        }
	        return s1.substring(0, idx);
	    }
	
	public static void main(String[] args) {
		String strs[] = {"flower","flow","flight"};
		String response=longestCommonPrefix(strs);
		System.out.println("The Expected Output is ::"+response);

	}

}
