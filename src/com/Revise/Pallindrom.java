package com.Revise;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0;
		int num=n;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(num==rev)
			System.out.println("It is a Pallindrom number");
		else
			System.out.println("It is not a Pallindrom number");
	}

}
