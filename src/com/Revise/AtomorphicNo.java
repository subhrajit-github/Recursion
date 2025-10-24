package com.Revise;

import java.util.Scanner;

public class AtomorphicNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Range");
		int st = sc.nextInt();
		int end = sc.nextInt();
		for (int i = st; i <= end; i++) {
			int n = i;
			boolean flag = true;
			int square = n * n;
			while (n > 0) {
				if (n % 10 != square % 10) {
					flag = false;
					break;
				}
				n /= 10;
				square /= 10;
			}

			if (flag)
				System.out.println(i);

		}

	}

}
