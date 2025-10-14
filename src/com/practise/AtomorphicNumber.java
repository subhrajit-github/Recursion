package com.practise;

import java.util.Scanner;

public class AtomorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int num=n;
		int square=n*n;
		boolean flag=true;
		while(n>0) {
			if(n%10!=square%10) {
				flag=false;
				break;
			}
			square/=10;
			n/=10;
		}
		if(flag)
			System.out.println("It is a Atomorphic number");
		else
			System.out.println("It is not a Atomorphic number");
		
	}

}
