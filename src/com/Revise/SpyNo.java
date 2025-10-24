package com.Revise;

import java.util.Scanner;

public class SpyNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Range");
		int st = sc.nextInt();
		int end = sc.nextInt();
		for (int i = st; i <= end; i++) {
			int num = i;
			int sum = 0;
			int prod = 1;
			while (num > 0) {
				sum += num % 10;
				prod *= num % 10;
				num /= 10;
			}
			if (sum == prod)
				System.out.println(i);
		}

	}

}
