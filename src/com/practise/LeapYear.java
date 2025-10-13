package com.practise;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int y=sc.nextInt();
		if(y%400==0)
			System.out.println("It is a Leap Year");
		else if(y%4==0 && y%100!=0)
			System.out.println("It is a Leap Year");
		else
			System.out.println("It is not a Leap Year");
	}

}
