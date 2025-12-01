package com.String;

public class UniqueCharUsingOneLoop {

	public static void main(String[] args) {
		String s="java is very easy";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!res.contains(ch+""))
				res+=ch;
		}
		System.out.println(res);
	}

}
