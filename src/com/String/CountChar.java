package com.String;

public class CountChar {

	public static void main(String[] args) {
		String s="JspiderS@#123";
		int uc=0;
		int lc=0;
		int nc=0;
		int sc=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='a' && ch<='z')
				lc++;
			else if(ch>='0' && ch<='9')
				nc++;
			else
				sc++;
				}
		System.out.println("UC ="+uc);
		System.out.println("LC ="+lc);
		System.out.println("NC ="+nc);
		System.out.println("SC ="+sc);
	}

}
