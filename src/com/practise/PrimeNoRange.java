package com.practise;

import java.util.Scanner;

public class PrimeNoRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int num=i;
			boolean flag=true;
			for(int j=2;j<=num/2;j++) {
				if(num%j==0) {
					flag=false;
					break;
				}
			}
			if(num>1 && flag) {
				System.out.println(i);
			}
		}
	}

}
