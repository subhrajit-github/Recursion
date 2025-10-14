package com.RecPractise;

public class PallindromeNo {

	public static void main(String[] args) {
		range(1,1000);
	}
	public static void range(int st,int end) {
		if(st>end) return ;
		if(isPallindrome(st))
			System.out.println(st);
		range(st+1,end);
	}
	public static boolean isPallindrome(int n) {
		return isPallindrome(n,n,0);
	}
	public static boolean isPallindrome(int n, int num, int rev) {
		if(n==0) return num==rev;
		rev=rev*10+n%10;
		return isPallindrome(n/10,num,rev);
	}

}
