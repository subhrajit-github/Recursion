package com.Revise;

public class AtomorphicRec {

	public static void main(String[] args) {
		System.out.println(isAtomorphic(5,25));
	}
	public static boolean isAtomorphic(int n, int square) {
		if(n==0) return true;
		if(n%10!=square%10) return false;
		return isAtomorphic(n/=10,square/=10 );
		
	}

}
