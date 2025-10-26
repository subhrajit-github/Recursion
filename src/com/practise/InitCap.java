package com.practise;

public class InitCap {

	public static void main(String[] args) {
		String s="i love java";
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				if(i==0 || ch[i-1]==' ')
					ch[i]-=32;
			}
		}
		System.out.println(ch);
	}

}
