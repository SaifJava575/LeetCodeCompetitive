package com.nt.leetcode;

import java.time.LocalDate;

public class Lt_28_IsSubSequence {

	// T(C)=O(n) and S(C)=O(1)
	public static boolean isSubsequence(String s, String t) {
		if (s.length() < 1)
			return true;
		if (s.length() > t.length())
			return false;
		int j = 0;
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == s.charAt(j))
				j++;
		}
		if (j == s.length())
			return true;
		return false;
	}

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);
		
		
		String s = "abc", t = "ahbgdc";
		if (isSubsequence(s, t))
			System.out.println("Yes");
		else
			System.out.println("NO");
	}

}
