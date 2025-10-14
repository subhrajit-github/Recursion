package com.practise;

import java.util.Scanner;

public class ReverseRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int st=sc.nextInt();
		int end=sc.nextInt();
		for(int i=st;i<=end;i++) {
			int rev=0;
			int num=i;
			while(num>0) {
				int rem=num%10;
				rev=(rev*10)+rem;
				num/=10;
			}
			System.out.println(rev);
		}
		
	}

}
