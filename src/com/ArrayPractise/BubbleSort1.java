package com.ArrayPractise;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		int [] a= {2,4,7,3,2,8,9,4,2,6,8,6};
		sort1(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort1(int [] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j+1]=a[j];
					a[j+1]=temp;
				}
			}
		}
	}

}
