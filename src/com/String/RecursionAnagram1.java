package com.String;

public class RecursionAnagram1 {

	public static void main(String[] args) {
		System.out.println(isRecursionAnagram1("keep", "peek"));
	}
	public static boolean isRecursionAnagram1(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		if(s1.length()==0 && s2.length()==0) return true;
		char ch=s1.charAt(0);
		s1=s1.replace(ch+"", "");
		s2=s2.replace(ch+"","");
		return isRecursionAnagram1(s1, s2);
	}

}
