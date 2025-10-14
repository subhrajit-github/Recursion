package com.practise;

import java.util.Scanner;

public class DectoBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range");
		int st=sc.nextInt();
		int end=sc.nextInt();
		for(int i=st;i<=end;i++) {
			String bin=" ";
			int num=i;
			while(num>0) {
				int rem=num%2;
				bin=rem+bin;
				num/=2;
			}
			System.out.println(bin);
		}
	}

}
