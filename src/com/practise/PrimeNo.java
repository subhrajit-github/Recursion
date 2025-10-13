package com.practise;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
			
		}
		if(flag && n>1) {
			System.out.println("It is a Prime number");
		}
		else {
			System.out.println("It is not a Prime number");
		}
	}

}
