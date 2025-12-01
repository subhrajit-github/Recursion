package com.String;

public class MinOccurenceOfChar1 {

	public static void main(String[] args) {
		String s1="java is very easy";
		String s2="";
		int minCount=s1.length();
		char minch=' ';
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=(s1.length()-s2.length());
			if(minCount>count) {
				minCount=count;	
				minch=ch;
			}
			System.out.println(ch+"="+count);
			s1=s2;
		}
		System.out.println("===============");
		System.out.println(minch+"="+minCount);
		
	}

}
