package com.RecPractise;

public class ArmStrongNo {

	public static void main(String[] args) {
		range(1,10000);
	}
	public static void range(int st, int end) {
		if(st>end) return;
		if(isArmstrong(st))
			System.out.println(st);
		range(st+1,end);
	}
	public static boolean isArmstrong(int n) {
		int l=String.valueOf(n).length();
		return isArmstrong(n,n,0,l);
	}
	public static boolean isArmstrong(int n, int m, int sum, int l) {
		if(n==0) return m==sum;
		sum+=Math.pow(n%10, l);
		return isArmstrong(n/10,m,sum,l);
	}

}
