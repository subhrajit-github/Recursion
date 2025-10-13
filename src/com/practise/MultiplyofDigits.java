package com.practise;

import java.util.Scanner;

public class MultiplyofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int prod=1;
		while(n>0) {
			prod*=n%10;
			n/=10;
		}
		System.out.println(prod);
	}

}
