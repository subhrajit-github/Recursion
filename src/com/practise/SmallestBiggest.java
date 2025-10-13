package com.practise;

import java.util.Scanner;

public class SmallestBiggest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y)
			System.out.println(x+ " is bigger than "+y);
		else if(y>x)
			System.out.println(y+" is bigger than "+x);
		else
			System.out.println("Both "+x+" & "+y+" are equal ");
		
	}

}
