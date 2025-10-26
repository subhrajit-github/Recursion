package com.practise;

public class P5 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				int x = n * (i - 1);
				for (int j = 1; j <= n; j++) {
					++x;
					System.out.print(x);
				}
			}
			else {
				int x=n*i;
				for(int j=1;j<=n;j++) {
					System.out.print(x);
					x--;
				}
			}
			System.out.println();
		}
	}

}
