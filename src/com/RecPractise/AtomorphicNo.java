package com.RecPractise;

public class AtomorphicNo {

	public static void main(String[] args) {
		range(1,10000);
	}
	public static void range(int st, int end) {
		if(st>end) return;
		if(isAtomorphic(st))
			System.out.println(st);
		range(st+1,end);
	}
	public static boolean isAtomorphic(int n) {
		return isAtomorphic(n,n*n);
	}
	public static boolean isAtomorphic(int n, int square) {
		if(n==0) return true;
		if(n%10!=square%10) return false;
		return isAtomorphic(n/10, square/10);
	}

}
