package com.String;

public class MissingVowels {

	public static void main(String[] args) {
		String s="AEIOUaeiou";
		String str="java is very Easy";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(str.contains(ch+""))
				res+=ch;
		}
		System.out.println(res);
	}

}
