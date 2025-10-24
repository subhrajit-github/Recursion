package com.Revise;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Range");
		int st=sc.nextInt();
		int end=sc.nextInt();
		for(int i=st;i<=end;i++) {
			boolean flag=true;
			int num=i;
			for(int j=2;j<=num/2;j++) {
				if(num%j==0) {
					flag=false;
					break;
				}
		}
			if(i>1 && flag)
				System.out.println(i);
			
		
		}
		
	}

}
