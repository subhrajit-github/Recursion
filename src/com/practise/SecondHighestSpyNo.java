package com.practise;

import java.util.Scanner;

public class SecondHighestSpyNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range");
		int st=sc.nextInt();
		int end=sc.nextInt();
		int count=0;
		for(int i=end;i>=st;i--) {
			int num=i;
			int prod=1;
			int sum=0;
			
			while(num>0){
				sum+=num%10;
				prod*=num%10;
				num/=10;
			}
			if(sum==prod) {
				count++;
				if(count==2) {
					System.out.println(i);
				return;
				}
			}
		}
	}

}
