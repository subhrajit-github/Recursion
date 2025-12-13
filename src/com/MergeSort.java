package com;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int [] a= {3,5,1,4,6,2};
		sort4(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort4(int [] a) {
		if(a.length==1) return ;
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
				merge(left,right,a);
	}
	public static void merge(int [] a, int [] b, int [] c) {
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				c[k]=b[j];
				k++;
				j++;
			}
			else {
				c[k]=a[i];
				k++;
				i++;
			}
		}
		
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
	}

}
