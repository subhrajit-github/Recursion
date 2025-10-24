package com.Revise;

public class SpyRec {

	public static void main(String[] args) {
		System.out.println(isSpy(2,0,1));
	}
	public static boolean isSpy(int n, int sum, int prod) {
		if(n==0) return prod==sum;
		sum+=n%10;
		prod*=n%10;
		return isSpy(n/10, sum, prod);
	}

}
