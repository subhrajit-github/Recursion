package com.Revise;

public class GCDRec {

	public static void main(String[] args) {
		System.out.println(GCD(2, 4, 1, 1));
	}

	public static int GCD(int num1, int num2, int i, int gcd) {
		if(i>num1 || i>num2) return gcd;
		if (num1 % i == 0 & num2 % i == 0) gcd = i;
		return GCD(num1, num2, i + 1, gcd);
	}

}
