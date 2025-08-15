package com;

public class PerfectRange {
	public static void main(String [] args) {
		range(1,1000);
	}
	public static void range(int st,int end) {
		if(st>end) return;
		if(isPerfect(st)) System.out.println(st);
		range(st+1,end);
	}
	public static boolean  isPerfect(int n) {
		return isPerfect(n,1,0);
	}
public static boolean isPerfect(int n,int i,int sum) {
	if(i>n/2) return n==sum;
	if(n%i==0) sum+=i;
	return isPerfect(n,i+1,sum);
}
}
