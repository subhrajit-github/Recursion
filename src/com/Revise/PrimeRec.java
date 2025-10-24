package com.Revise;

public class PrimeRec {

	public static void main(String[] args) {
		range(1,100,0);
	}
	public static void range(int st, int end, int count) {
		if(st>end) return;
		if(isPrime(st,st/2)) {
			count++;
			if(count%2==0)
				System.out.println(st);
		}
		range(st+1, end, count);
	}
	public static boolean isPrime(int n) {
		return isPrime(n, n/2);
	}
	public static boolean isPrime(int n, int i) {
		if(i==0) return true;
		if(n%i==0) return false;
		if(n>1) return true;
		return isPrime(n, i-1);
	}

}
