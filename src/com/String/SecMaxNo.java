package com.String;

public class SecMaxNo {

	public static void main(String[] args) {
	int [] a= {1,2,3,4,5,6,7,8};
	int max1=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++) {
		if(max1<a[i]) {
			max2=max1;
			max1=a[i];
			}
		else if(max2<a[i] && a[i]!=max1)
			max2=a[i];
		}
	System.out.println(max2);
	}
	}


