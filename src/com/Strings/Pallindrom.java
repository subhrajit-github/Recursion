package com.Strings;

public class Pallindrom {
  public static void main(String [] args) {
	  System.out.println(isPallindrom("malayalam"));
  }
  public static boolean isPallindrom(String s) {
	  int i=0;
	  int j=s.length()-1;
	  while(i<j) {
		  if(s.charAt(i)!=s.charAt(j)) return false;
		  i++;
		  j--;
	  }
	  return true;
       
  }
}
