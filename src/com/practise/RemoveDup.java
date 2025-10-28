package com.practise;

public class RemoveDup {

	public static void main(String[] args) {
		String s="javadev";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!res.contains(ch+"")) res+=ch;
		}
		System.out.println(res);
	}

}
