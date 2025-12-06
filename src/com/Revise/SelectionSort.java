package com.Revise;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a= {1,2,9,6,3,8,5,3,6,5};
		sort1(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort1(int [] a) {
		for(int i=0;i<a.length;i++) {
			int smallEleIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[smallEleIndex])
					smallEleIndex=j;
			}
			int temp=a[i];
			a[i]=a[smallEleIndex];
			a[smallEleIndex]=temp;
		}
	}

}
