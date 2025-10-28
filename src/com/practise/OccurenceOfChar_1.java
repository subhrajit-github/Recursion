package com.practise;

public class OccurenceOfChar_1 {

	public static void main(String[] args) {
		String s1="javadev";
		String s2="";
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			System.out.println(ch+" = "+(s1.length()-s2.length()));
			s1=s2;
		}
		
	}

}
