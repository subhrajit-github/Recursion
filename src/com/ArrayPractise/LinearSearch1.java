package com.ArrayPractise;

public class LinearSearch1 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		System.out.println(find1(a,8));
	}
	public static int find1(int [] a, int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}

}
