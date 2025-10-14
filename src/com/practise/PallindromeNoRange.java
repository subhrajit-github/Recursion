package com.practise;

import java.util.Scanner;

public class PallindromeNoRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Range");
		int st=sc.nextInt();
		int end=sc.nextInt();
		for(int i=st;i<=end;i++) {
			int num=i;
			int rev=0;
			while(num>0) {
				int rem=num%10;
				rev=(rev*10)+rem;
				num/=10;
			}
			if(rev==i)
				System.out.println(i);
		}
			
	}

}
