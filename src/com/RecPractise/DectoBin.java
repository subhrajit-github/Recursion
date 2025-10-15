package com.RecPractise;

public class DectoBin {

	public static void main(String[] args) {
		System.out.println(dectoBinary(31,0,1));
	}
	public static int dectoBinary(int dec, int bin, int p) {
		if(dec==0) return bin;
		bin+=(dec%2)*p;
		return dectoBinary(dec/2, bin,p*10);
	}

}
