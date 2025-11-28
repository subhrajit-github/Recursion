package com.String;

public class SmallestSubStringPallindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String smallPall=s;
		for(int i=0;i<s.length();i++) {
			for(int j=i+3;j<s.length();j++) {
				String str=s.substring(i,j);
				if(isPallindrome(str)) {
					System.out.println(str);
					if(smallPall.length()>str.length())
						smallPall=str;
				}
			}
		}
		System.out.println("==========");
		System.out.println(smallPall);
	}
	public static boolean isPallindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
