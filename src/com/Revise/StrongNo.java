package com.Revise;

import java.util.Scanner;

public class StrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Range");
		int st = sc.nextInt();
		int end = sc.nextInt();
		for (int i = st; i <= end; i++) {
			int sum = 0;
			int num = i;
			while (num > 0) {
				int rem = num % 10;
				int fact = 1;
				for (int j = 1; j <= rem; j++) {
					fact *= j;
				}
				sum += fact;
				num /= 10;
			}

			if (sum == i)
				System.out.println(i);
			
		}

	}

}
