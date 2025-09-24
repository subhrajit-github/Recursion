package com.Strings;

public class SmallestSubStringPall {

	public static void main(String[] args) {
		String s="malayalam";
		String smallpall=s;
		for(int i=0;i<s.length();i++) {
			for(int j=i+2;j<s.length();j++) {
				String str=s.substring(i,j);
				if(isPallindrom(str)) {
					System.out.println(str);
					if(str.length()<smallpall.length())
						smallpall=str;
				}
			}
		}
		System.out.println("============");
		System.out.println(smallpall);
	}
	public static boolean isPallindrom(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
