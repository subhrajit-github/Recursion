package com.RecPractise;

public class Fact {

	public static void main(String[] args) {
	   System.out.println(isFact(4));
	}
	public static int isFact(int n) {
		if(n==1 ||n==0) return 1;
		return n*isFact(n-1);
	}

}
