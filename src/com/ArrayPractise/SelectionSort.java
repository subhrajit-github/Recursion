package com.ArrayPractise;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a= {5,3,6,7,1,2,3};
		sortselection(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sortselection(int [] a) {
		for(int i=0;i<a.length;i++) {
			int smallEleIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[smallEleIndex]>a[j])
					smallEleIndex=j;
			}
			int temp=a[i];
			a[i]=a[smallEleIndex];
			a[smallEleIndex]=temp;
		}
	}

}
