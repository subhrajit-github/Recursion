package com.practise;

public class VowelCount {

	public static void main(String[] args) {
		String s="i love java";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U')
				count++;
		}
		System.out.println(count);
	}

}
