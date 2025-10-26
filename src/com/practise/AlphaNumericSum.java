package com.practise;

public class AlphaNumericSum {

	public static void main(String[] args) {
		String s="JspiderS@#123";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				sum+=ch-'0';
		}
		System.out.println(sum);
	}

}
