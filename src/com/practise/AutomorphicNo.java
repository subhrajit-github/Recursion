package com.practise;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int square=n*n;
		int num=n;
		boolean flag=true;
		while(n>0) {
			if(n%10 != square%10) {
				flag=false;
				break;
			}
			n/=10;
			square/=10;
		}
		if(flag)
			System.out.println("It is a Automorphic Number");
		else
			System.out.println("It is not a Automorphic Number");
	}

}
