package com.Revise;

public class DectoBinRec {

	public static void main(String[] args) {
		System.out.println(dectobin(6, 0, 1));
	}

	public static int dectobin(int dec, int bin, int p) {
		if (dec == 0)
			return bin;
		bin += (dec % 2) * p;
		return dectobin(dec / 2, bin, p * 10);
	}

}
