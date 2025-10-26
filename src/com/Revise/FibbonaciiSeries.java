package com.Revise;

import java.util.Scanner;

public class FibbonaciiSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Range");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=n;i++){
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
