package com.ArrayPractise;

public class BinarySearchRec {

	public static void main(String[] args) {
		int [] a= {5,3,6,7,1,2,3};
		System.out.println(binaryrec(a,7,0,a.length-1));
	}
	public static int binaryrec(int [] a, int key, int st, int end) {
		if(st>end) return -1;
		int mid=(st+end)/2;
		if(key==a[mid]) return mid;
		else if(key<a[mid]) return binaryrec(a, key, st, mid-1);
		else
			return binaryrec(a, key, mid+1, end);
	}

}
