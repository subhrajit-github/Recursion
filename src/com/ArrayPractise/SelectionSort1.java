package com.ArrayPractise;

import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
		int [] a= {2,4,7,3,2,8,9,4,2,6,8,6};
		sort2(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort2(int [] a) {
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
