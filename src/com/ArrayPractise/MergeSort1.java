package com.ArrayPractise;

public class MergeSort1 {

	public static void main(String[] args) {
		int [] a= {4,2,5,1,3};
	}
	public static void sort(int [] a) {
		if(a.length==1) return;
		int [] left=new int[a.length/2];
		int [] right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=a[j+left.length];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void merge(int [] a, int [] b, int [] c) {
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
