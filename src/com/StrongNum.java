package com;

public class StrongNum {
 public static void main(String [] args) {
	 int n=145;
	 System.out.println(isStrong(n,n,0));
 }  

public static boolean isStrong(int n,int m,int sum) {
	if(n==0) return m==sum;
	sum+=fact(n%10);
	return isStrong(n/10,m,sum);
}
public static int fact(int n) {
	if(n==0) return 1;
	return n*fact(n-1);
}
}
