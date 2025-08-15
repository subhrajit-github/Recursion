package com;

public class SecLarPrimeNum {
	public static void main(String [] args) {
		range(1,1000,0);
	}
	public static void range(int st,int end,int count) {
		if(st>end) return;
		if(isPrime(end,end/2)) {
			count++;
		if(count==2)
			{
			System.out.println(end); 
			}
		}
		range(st,end-1,count);
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
