package com;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] a= {4,9,2,5,1,8,9};
		sort3(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort3(int [] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
