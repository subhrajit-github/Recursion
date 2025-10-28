package com.TWO_D_Array;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{1,2,3}};
		int [][] b= {{1,2,3},{1,2,3}};
		int [][] c=new int[2][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int[]n:c) {
			System.out.println(Arrays.toString(n));
		}
	}

}
