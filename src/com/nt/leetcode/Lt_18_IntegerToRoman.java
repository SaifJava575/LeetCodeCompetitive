package com.nt.leetcode;

public class Lt_18_IntegerToRoman {

	public static String intToRoman(int num) {
		String ones[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String tens[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String hrns[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String ths[] = { "", "M", "MM", "MMM" };

		return ths[num / 1000] + hrns[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
	}

	public static void main(String[] args) {
		int num = 3949;
		String response = intToRoman(num);
		System.out.println("The Roman number is ::" + response);

	}

}
