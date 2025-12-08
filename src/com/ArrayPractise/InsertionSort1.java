package com.ArrayPractise;

import java.util.Arrays;

public class InsertionSort1 {

	public static void main(String[] args) {
		int [] a= {2,4,7,3,2,8,9,4,2,6,8,6};
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
