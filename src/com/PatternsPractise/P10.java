package com.PatternsPractise;

public class P10 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=i;j<=n-i;j++) {
				if(i+j==n-1 || i==1 || i+j==n+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
