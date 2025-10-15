package com.PatternsPractise;

public class Pyramid {

	public static void main(String[] args) {
		int n=5;
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star+=2;
			space--;
		}
	}

}
