package com.practise;

public class ReverseHollowPyramid {

	public static void main(String[] args) {
		int n=5;
		int star=(n*2)-1;
		int space=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(i==1 || j==1 || j==star)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			star-=2;
			space++;
		}
	}

}
