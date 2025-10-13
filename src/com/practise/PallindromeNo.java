package com.practise;

import java.util.Scanner;

public class PallindromeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int rev=0;
		int num=n;
		while(n>0) {
			int rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
		}
		if(num==rev) {
			System.out.println("it is Pallindrome Number");
		}
		else {
			System.out.println("It is not a Pallindrome Number");
		}
	}

}
