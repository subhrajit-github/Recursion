package com.String;

//Only applicable for sorted Arrays
public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		System.out.println(find(a,8));
	}
	public static int find(int [] a, int key) {
		int st=0;
		int end=a.length-1;
		while(st<=end) {
			int mid=(st+end)/2;
			if(a[mid]==key) return mid;
			else if(key<a[mid])
				end=mid-1;
			else
				st=mid+1;
		}
		return -1;
	}

}
