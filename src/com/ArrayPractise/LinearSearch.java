package com.ArrayPractise;

public class LinearSearch {

	public static void main(String[] args) {
		int [] a= {5,3,6,7,1,2,3};
		System.out.println(search(a,2));
	}
	public static int search(int [] a, int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
		return -1;
	}

}
