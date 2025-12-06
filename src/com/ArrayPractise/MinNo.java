package com.ArrayPractise;

public class MinNo {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);
	}

}
