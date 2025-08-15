package com;

public class StrongNumRange {
   public static void main(String [] args) {
	   range(1,1000);
   } 
   public static void range(int st,int end) {
	   if(st>end) return;
	   if(isStrong(st)) System.out.println(st);
	   range(st+1,end);
   }
   public static boolean isStrong(int n) {
	   return isStrong(n,n,0);
   }
   public static boolean isStrong(int n,int m,int sum) {
	   if(n==0) return m==sum;
	   sum+=fact(n%10);
	   return isStrong(n/10,m,sum);
   }
   public static int fact(int n) {
	   if(n==0) return 1;
	   return n*fact(n-1);
   }
}
