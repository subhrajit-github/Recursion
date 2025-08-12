package com;
import java.util.Scanner;
public class Perfect {
public static void main (String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println(isPerfect(n,1,0));
}
	public static boolean isPerfect(int n,int i,int sum) {
		if(i>n/2) return n==sum;
		sum+=i;
		return isPerfect(n,i+1,sum);
	}
}

