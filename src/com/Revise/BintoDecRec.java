package com.Revise;

public class BintoDecRec {

	public static void main(String[] args) {
		System.out.println(BintoDec(111, 0, 1));
	}

	public static int BintoDec(int bin, int dec, int p) {
		if (bin == 0)
			return dec;
		dec += (bin % 10) * p;
		return BintoDec(bin / 10, dec, p*2);
	}

}
