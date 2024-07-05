package com.nt.leetcode;

public class Lt_27_ValidPalindrome {

	//T(C)=O(N)   and S(C)=O(1)
	public static boolean isPalindrome(String s) {
		if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
	}

	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		if(isPalindrome(s))
			System.out.println("It is Palindrome String ");
		else 
			System.out.println("it is not palindrome String ");

	}

}
