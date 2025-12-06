package com.Revise;

public class BinarySearchRec {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		System.out.println(find1(a,8,0,a.length-1));
	}
	public static int find1(int [] a, int key, int st, int end) {
		if(st>end) return -1;
		int mid=(st+end)/2;
		if(key==a[mid]) return mid;
		else if(key<a[mid]) return find1(a, key, st, mid-1);
		else return find1(a, key, mid+1, end);
	}

}
