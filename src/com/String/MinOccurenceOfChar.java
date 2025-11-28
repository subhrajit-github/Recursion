package com.String;

public class MinOccurenceOfChar {

	public static void main(String[] args) {
		String s1="jagdgdbjkergergkm";
		String s2="";
		char minChar=' ';
		int mincount=s1.length();
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			if(mincount>count) {
				mincount=count;
				minChar=ch;
			}
			System.out.println(ch+"="+count);
			s1=s2;
		}
		System.out.println("=========");
		System.out.println(minChar+"="+mincount);
	}

}
