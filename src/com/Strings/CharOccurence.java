package com.Strings;

public class CharOccurence {

	public static void main(String[] args) {
		String s="elgihere hgwltvjea riheau  jkegih3 y3inoa hiae4 yheah";
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\u0000') continue;
			int count =1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			System.out.println(ch[i]+" = "+count);
		}
		
	}

}
