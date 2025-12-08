package com.ArrayPractise;

public class BinarySearch1 {

	public static void main(String[] args) {
	int [] a= {1,2,3,4,5,6,7,8,9};
	System.out.println(search1(a,8));
	}
	public static int search1(int [] a, int key) {
		int st=0;
		int end=a.length-1;
		while(st<=end) {
			int mid=(st+end)/2;
			if(a[mid]==key)
				return mid;
			else if(key<a[mid])
				 end=mid-1;
			else
				 st=mid+1;
		}
		return -1;
	}

}
