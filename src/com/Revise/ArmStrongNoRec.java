package com.Revise;

public class ArmStrongNoRec {

	public static void main(String[] args) {
		range(1,1000);
	}
	public static void range(int st, int end) {
		if(st>end) return;
		if(isArmStrong(st))
			System.out.println(st);
		range(st+1, end);
	} 
	public static boolean isArmStrong(int n) {
		int l=String.valueOf(n).length();
		return isArmStrong(n, n, 0, l);
	}
	public static boolean isArmStrong(int n, int m, int sum, int l) {
		if(n==0) return m==sum;
		sum+=Math.pow(n%10, l);
		return isArmStrong(n/10, m, sum, l);
	}

}
