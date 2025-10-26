package com.Revise;

public class PallindromRec {

	public static void main(String[] args) {
		System.out.println(isPallindrom(121, 121, 0));
	}
	public static boolean isPallindrom(int n, int m, int rev) {
		if(n==0) return m==rev;
		rev=rev*10+(n%10);
		return isPallindrom(n/10, m, rev);
	}

}
