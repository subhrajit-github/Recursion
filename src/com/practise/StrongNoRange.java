package com.practise;

import java.util.Scanner;

public class StrongNoRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int num=i;
			int sum=0;
			while(num>0) {
				int rem=num%10;
				int prod=1;
				for(int j=1;j<=rem;j++) {
					prod*=j;
				}
				sum+=prod;
				num/=10;
			}
			if(sum==i)
				System.out.println(i);
		}
	}

}
