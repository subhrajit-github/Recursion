package com;

public class ArmstrongNum {
	static int n;
	static int l=("n+ ").length();
	public static void main(String [] args) {
		range(10,1000);
	}
	public static void range(int st,int end) {
		if(st>end) return;
		if(isArmstrong(st)) System.out.println(st);
		range(st+1,end);
	}
	public static boolean isArmstrong(int n) {
		return isArmstrong(n,n,0);
	}
	
	public static boolean isArmstrong(int n,int m,int sum) {
		if(n==0) return m==sum;
		sum+=Math.pow(n%10,l);
		return isArmstrong(n/10,m,sum);
	}
}

