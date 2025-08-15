package com;

public class LargestPrimeNum {
	public static void main(String [] args){
		range(100,6000);
	}
	public static void range(int st,int end) {
		if(st>end) return;
		if(isPrime(end,end/2)) {
			
			System.out.println(end);
			return;
		}
		range(st,end-1);
	}
    public static boolean isPrime(int n) {
    	return isPrime(n,n/2);
    }
	public static boolean isPrime(int n,int i) {
		if(i==1) return true;
		if(n<=1 || n%i==0) return false;
		return isPrime(n,i-1);
	}
}
