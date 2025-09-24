package com.Strings;

public class ReplaceVowels {

	public static void main(String[] args) {
		String s="java";
		char [] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
		}
		if(count>=3) {
			for(int i=0;i<ch.length;i++) {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
					ch[i]='_';
			}
			
			System.out.println(ch);
		}
		else
			System.out.println(ch);
	}

}
