package com.String;

public class MaxOccuerenceOfChar {

	public static void main(String[] args) {
		String s1="javaaadevvv";
		String s2="";
		char maxChar=' ';
		int maxcount=0;
		while(s1.length()>0) {
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"","");
			int count=s1.length()-s2.length();
			if(count>maxcount) {
				maxcount=count;
				maxChar=ch;
			}
			s1=s2;
			System.out.println(ch+"="+count);
		}
		System.out.println("=======");
		System.out.println(maxChar+"="+maxcount);
	}

}
