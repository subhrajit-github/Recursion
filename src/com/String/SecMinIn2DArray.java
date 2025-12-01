package com.String;

public class SecMinIn2DArray {

	public static void main(String[] args) {
		int [][] a= {{4,5,2},{4,-1,3},{6,2,1}};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(min1>a[i][j]) {
					min2=min1;
					min1=a[i][j];
				}
				else if(min2>a[i][j] && a[i][j]!=min1) {
					min2=a[i][j];
				}
			}
		}
		System.out.println(min1);
		System.out.println(min2);
	}

}
