package com;

public class Spy {
    public static void main(String [] args) {
    	range(1,1000);
    }

public static void range(int st,int end) {
	if(st>end) return;
	if(isSpy(st)) System.out.println(st);
	range(st+1,end);
	
}
public static boolean isSpy(int n) {
	return isSpy(n,0,1);
}
public static boolean isSpy(int n,int sum,int prod) {
	if(n==0) return sum==prod;
	sum+=n%10;
	prod*=n%10;
	return isSpy(n/10,sum,prod);
}
}
