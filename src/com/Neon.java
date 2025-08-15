package com;

public class Neon {
	public static void main(String [] args) {
		range1(1,1000);
	}
	public static void range1(int st,int end) {
		if(st>end) return;
		if(isNeon(st)) System.out.println(st);
		range1(st+1,end);
	}
	public static boolean isNeon(int n) {
		return isNeon(n,n*n,0);
	}
public static boolean isNeon(int n,int square,int sum) {
	if(square==0) return n==sum;
	sum+=square%10;
	return isNeon(n,square/10,sum);
}
}
