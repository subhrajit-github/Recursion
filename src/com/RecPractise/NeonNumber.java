package com.RecPractise;

public class NeonNumber {

	public static void main(String[] args) {
		range(1,1000);
	}
	public static void range(int st, int end) {
		if(st>end) return;
		if(isNeon(st))
			System.out.println(st);
		range(st+1, end);
	}
	public static boolean isNeon(int n) {
		return isNeon(n,0,n*n);
	}
	public static boolean isNeon(int n, int sum, int square) {
		if(square==0) return n==sum;
		sum+=square%10;
		return isNeon(n,sum,square/10);
	}

}
