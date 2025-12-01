package com.String;

public class MaxOccurenceOfChar1 {

	public static void main(String[] args) {
		String s1="java is very easy";
		String s2="";
		int maxCount=0;
		char maxch=' ';
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=(s1.length()-s2.length());
			if(maxCount<count) {
				maxCount=count;
				maxch=ch;
			}
			System.out.println(ch+"="+count);
			s1=s2;
		}
		System.out.println("===================");
		System.out.println(maxch+"="+maxCount);
	}

}
