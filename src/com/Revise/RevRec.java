package com.Revise;

public class RevRec {

	public static void main(String[] args) {
		System.out.println(Rev(122,0));
	}
	public static int Rev(int n, int rev) {
		if(n==0) return rev;
		rev=rev*10+(n%10);
		return Rev(n/10,rev);
	}

}
