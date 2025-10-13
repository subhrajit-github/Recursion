package com.practise;

import java.util.Scanner;

public class NeonNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=0;
		int square=n*n;
		int num=n;
		while(square>0) {
			int rem=square%10;
			sum+=rem;
			square/=10;
		}
		if(num==sum) {
			System.out.println("It is Neon number");
		}
		else {
			System.out.println("It is not a Neon number");
		}
		
	}

}
