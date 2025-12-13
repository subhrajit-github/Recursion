package com.ArrayPractise;

import java.util.Arrays;

public class MergeSort1 {

	public static void main(String[] args) {
		int [] a= {4,2,5,1,3};
		sort4(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort4(int [] a) {
		if(a.length==1) return;
		int [] left=new int[a.length/2];
		int [] right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=a[j+left.length];
		}
		sort4(left);
		sort4(right);
		merge4(left,right,a);
	}
	public static void merge4(int [] a, int [] b, int [] c) {
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
	}

}
