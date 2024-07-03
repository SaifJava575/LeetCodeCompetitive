package com.nt.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lt_25_ZigZagConversion {

	//T(C)=O(n)   and S(C)=O(1)
	public static String convert(String s, int numRows) {
		if (numRows == 1 || numRows >= s.length()) {
			return s;
		}
		int idx = 0, d = 1;
		@SuppressWarnings("unchecked")
		List<Character>[] rows = new ArrayList[numRows];
		for (int i = 0; i < numRows; i++) {
			rows[i] = new ArrayList<>();
		}

		for (char c : s.toCharArray()) {
			rows[idx].add(c);
			if (idx == 0) {
				d = 1;
			} else if (idx == numRows - 1) {
				d = -1;
			}
			idx += d;
		}
		StringBuilder result = new StringBuilder();
		for (List<Character> row : rows) {
			for (char c : row) {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		String response = convert(s, 4);
		System.out.println("The Zigzag String is ::" + response);
	}
}
