package com.String;

public class ReplaceConsecutive {

	public static void main(String[] args) {
		String s="bossss";
		String res=""+s.charAt(0);
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				res=res+"$";
			}
			else {
				res=res+s.charAt(i);
			}
		}
		System.out.println(res);
	}

}
