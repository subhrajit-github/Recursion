package com.RecPractise;

public class Reverse {

	public static void main(String[] args) {
		System.out.println(isRev(122,0));
	}
	public static int isRev(int n,int rev) {
		if(n==0) return rev;
		rev=(rev*10)+n%10;
		return isRev(n/10,rev);
	}

}
