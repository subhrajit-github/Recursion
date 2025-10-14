package com.practise;

import java.util.Scanner;

public class BintoDecimal {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Binary Number");
	int bin=sc.nextInt();
	int dec=0;
	int prod=1;
	while(bin>0) {
		int rem=bin%10;
		dec+=rem*prod;
		prod*=2;
		bin/=10;
	}
	System.out.println(dec);
	}

}
