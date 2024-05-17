package com.nt.leetcode;

import java.util.ArrayList;

public class Lt_02_ZigzagConversion {

	// T(C)=O(N) and S(C)=O(n)
	public static String convert(String s, int r) {
		if (r == 1 || s.length() < r)
			return s;

		ArrayList<StringBuilder> al = new ArrayList<>();
		int k = 0;
		for (int i = 0; i < r; i++)
			al.add(new StringBuilder());

		boolean down = false;
		for (char c : s.toCharArray()) {
			al.get(k).append(c);
			if (k == 0 || k == r - 1)
				down = !down;
			k += down ? 1 : -1;
		}

		StringBuilder st = new StringBuilder();
		for (StringBuilder str : al)
			st.append(str);
		return st.toString();
	}

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String response = convert(s, numRows);
		System.out.println("ZigZag Pattern stirng is ::" + response);

	}

}
