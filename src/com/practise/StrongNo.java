package com.practise;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=0;
		int num=n;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(num==sum)
		System.out.println("It is a Spy number");
		else
			System.out.println("It is not a Spy number");
	}

}
