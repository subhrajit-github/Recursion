package com.practise;

public class HollowPyramid {

	public static void main(String[] args) {
		int n=5;
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j==1 || j==star || i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			star+=2;
			space--;
		}
	}

}
