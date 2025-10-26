package com.practise;

public class ReverseString {

	public static void main(String[] args) {
		String s="abc";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			res+=ch;
		}
		System.out.println("res = "+res);
	}

}
