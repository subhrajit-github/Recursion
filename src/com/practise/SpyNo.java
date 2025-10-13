package com.practise;

import java.util.Scanner;

public class SpyNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=0;
		int prod=1;
		while(n>0) {
			sum+=n%10;
			prod*=n%10;
			n/=10;
		}
		if(sum==prod) {
			System.out.println("It is a Spy number");
		}
		else
			System.out.println("It is not a Spy number");
	}

}
