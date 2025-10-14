package com.practise;

public class AtomorphicNoRecursion {

	public static void main(String[] args) {
		range(1,2000,0);
	}
	public static void range(int st, int end, int count) {
		if(st>end) return;
		if(isAtomorphic(st)) {
			count++;
			if(count%2==0)
				System.out.println(st);
		}
		range(st+1,end,count);
	}
	public static boolean isAtomorphic(int n) {
		return isAtomorphic(n,n*n);
	}
	public static  boolean isAtomorphic(int n, int square) {
		if(n==0) return true;
		if(n%10!=square%10) return false;
		
		return isAtomorphic(n/10,square/10);
				
	}

}
