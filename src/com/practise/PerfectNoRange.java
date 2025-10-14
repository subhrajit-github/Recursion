package com.practise;

import java.util.Scanner;

public class PerfectNoRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int sum=0;
			int num=i;
			for(int j=1;j<=num/2;j++) {
				if(num%j==0)
					sum+=j;
			}
			if(sum==i)
				System.out.println(i);
		}
	}

}
