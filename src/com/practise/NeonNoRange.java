package com.practise;

import java.util.Scanner;

public class NeonNoRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			int num=i;
			int square=i*i;
			int sum=0;
			while(square>0) {
				sum+=square%10;
				square/=10;
			}
			if(sum==num)
				System.out.println(num);
		}
	}

}
