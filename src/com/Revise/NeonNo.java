package com.Revise;

import java.util.Scanner;

public class NeonNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Range");
		int st = sc.nextInt();
		int end = sc.nextInt();
		for (int i = st; i <= end; i++) {
			int n = i;
			int square = n * n;
			int sum = 0;
			while (square > 0) {
				sum += square % 10;
				square /= 10;
			}
			if (n == sum)
				System.out.println(i);
		}

	}

}
