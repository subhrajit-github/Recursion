package com.practise;

import java.util.Arrays;

public class Sum2DArray {

	public static void main(String[] args) {
		int [][] a= {{1,2,3}, {4,5,6}};
		int [][] b= {{4,5,6},{6,7,8}};
		int [][] c=new int[2][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		for(int [] n:c) {
			System.out.println(Arrays.toString(n));
		}
	}

}
