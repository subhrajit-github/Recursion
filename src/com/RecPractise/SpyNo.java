package com.RecPractise;

public class SpyNo {

	public static void main(String[] args) {
		range(1,1000,0);
	}
	public static void range(int start,int end,int count) {
		if(start>end) return;
		if(isSpy(start)) {
			count++;
			if(count%2==0)
				System.out.println(start);
		}
		range(start+1,end,count);
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
