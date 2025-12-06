package com.ArrayPractise;

public class SecMinNo {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min1>a[i]) {
				min2=min1;
				min1=a[i];
			}
			else if(min2>a[i] && a[i]!=min1)
				min2=a[i];
			
		}
		System.out.println(min2);
	}

}
