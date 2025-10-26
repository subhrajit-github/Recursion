package com.Revise;

import java.util.Scanner;

public class DectoBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal number");
		int dec=sc.nextInt();
		int bin=0;
		int p=1;
		while(dec>0) {
			int rem=dec%2;
			bin+=rem*p;
			dec/=2;
			p*=10;
		}
		System.out.println(bin);
	}

}
