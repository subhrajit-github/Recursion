package com.Revise;

import java.util.Scanner;

public class BintoDec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
	    System.out.println("Enter a Binary number");
		int bin=sc.nextInt();	
		int dec=0;
		int p=1;
		while(bin>0) {
			int rem=bin%10;
			dec+=rem*p;
			bin/=10;
			p*=2;
		}
		System.out.println(dec);
	}

}
