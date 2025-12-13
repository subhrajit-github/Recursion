package com;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a= {4,9,2,5,1,8,9};
		sort2(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort2(int [] a) {
		for(int i=0;i<a.length;i++) {
			int smallEleIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[smallEleIndex]) {
					smallEleIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[smallEleIndex];
			a[smallEleIndex]=temp;
		}
	}

}
