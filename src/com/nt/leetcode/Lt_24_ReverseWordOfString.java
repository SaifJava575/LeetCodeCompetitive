package com.nt.leetcode;

public class Lt_24_ReverseWordOfString {

	//T(C)=O(N)  and S(C)=O(1)
	public static String reverseWords(String s) {
     String arr[]= s.trim().split("\\s+");
     String out="";
     for(int i=arr.length-1;i>0;i--)
    	 out+=arr[i]+" ";
     out+=arr[0];
     return out;
	}

	public static void main(String[] args) {
		String s = "the sky is blue";
		String response = reverseWords(s);
		System.out.println("The Reverse word of String ::" + response);

	}

}
