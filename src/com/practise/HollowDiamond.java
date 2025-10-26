package com.practise;

public class HollowDiamond {

	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(j==1 || j==star)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<=n/2) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
		}
	}

}
