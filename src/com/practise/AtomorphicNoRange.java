package com.practise;

import java.util.Scanner;

public class AtomorphicNoRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int num=i;
			boolean flag=true;
			int square=i*i;
			while(num>0) {
				if(num%10!=square%10) {
					flag=false;
					break;
				}
				num/=10;
				square/=10;
			}
			if(flag)
				System.out.println(i);
		}
	}

}
