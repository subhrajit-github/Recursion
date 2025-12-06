package com.String;

import java.util.Arrays;

public class InsertionSort1 {

	public static void main(String[] args) {
		int [] a= {4,6,6,3,9,4,87,3,2,8,9,2,0,1,0,3,7,9,3};
		sortinsertion1(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sortinsertion1(int [] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>a[key]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
