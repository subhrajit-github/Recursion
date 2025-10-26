package com.practise;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="javadev";
		String res="";
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\u0000') continue;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j])
					ch[j]='\u0000';
			}
			res+=ch[i];
		}
		System.out.println(res);
	}

}
