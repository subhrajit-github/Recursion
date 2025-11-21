package com.String;

public class CountWord {

	public static void main(String[] args) {
		String s="java is very easy";
		int count=0;
		int i=0;
		int j=0;
		while(j<s.length()) {
			while(j<s.length() && s.charAt(j)==' ' ) 
				j++;
			if(j<s.length() && s.charAt(j)!=' ') {
				count++;
				while(j<s.length() && s.charAt(j)!=' ') {
					j++;
				}
			}
	}
		System.out.println(count);
	}

}
