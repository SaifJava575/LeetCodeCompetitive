package com.nt.leetcode;

public class Lt_19_LastWordLength {

	//T(C)=O(N)   and S(C)=O(1)
	public static int lengthOfLastWord(String s) {
		String[] arr = s.split(" ");
		return arr[arr.length - 1].length();
	}

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		int response=lengthOfLastWord(s);
		System.out.println("Last word of length is ::"+response);

	}

}
