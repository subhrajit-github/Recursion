package com.RecPractise;

public class BintoDec {

	public static void main(String[] args) {
		System.out.println(bintoDecimal(11111,0,1));
	}
	public static int bintoDecimal(int bin,int dec, int p) {
		if(bin==0) return dec;
		dec+=(bin%10)*p;
		return bintoDecimal(bin/10,dec,p*2);
	}

}
