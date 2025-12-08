package com.ArrayPractise;

public class BinarySearchRec1 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		System.out.println(search2(a, 5, 0, a.length-1));
	}
	public static int search2(int [] a, int key, int st, int end) {
		if(st>end) return -1;
		int mid=(st+end)/2;
		if(a[mid]==key) return mid;
		else if(key<a[mid]) return search2(a, key, st, mid-1);
		else
			return search2(a, key, st+1, end);
	}

}
