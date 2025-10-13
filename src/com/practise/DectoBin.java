package com.practise;

import java.util.Scanner;

public class DectoBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal Number");
		int dec=sc.nextInt();
		String bin=" ";
		while(dec>0) {
			int rem=dec%2;
			bin=rem+bin;
			dec/=2;
		}
		System.out.println(bin);
	}

}
