package com.practise;

public class ArrangeString {

	public static void main(String[] args) {
		String s="JspiderS@#123";
		String lc="";
		String uc="";
		String nc="";
		String sc="";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z')
   			 lc+=ch;
   		 else if(ch>='A' && ch<='Z')
   			 uc+=ch;
   		 else if(ch>='0' && ch<='9')
   			 nc+=ch;
   		 else
   			 sc+=ch;
		}
		res+=nc+sc+lc+uc;
		System.out.println(res);
	}

}
