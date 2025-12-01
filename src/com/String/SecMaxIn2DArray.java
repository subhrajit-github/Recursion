package com.String;

public class SecMaxIn2DArray {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(max1<a[i][j]) {
					max2=max1;
					max1=a[i][j];
				}
				else if(max2<a[i][j] && a[i][j]!=max1) {
					max2=a[i][j];
				}
			}
		}
		System.out.println(max1);
		System.out.println(max2);

	}

}
