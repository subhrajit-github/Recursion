package com;

public class PrimeNum {
public static void main(String [] args) {
	range(1,1000);
}
public static void range(int st,int end) {
	if(st>end) return;
	if(isPrime(st,st/2)) System.out.println(st);
	range(st+1,end);
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
