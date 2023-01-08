package com.app;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Nanditha";
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(str);
		
		sb.reverse();
		System.out.println(sb);
		/*
		 * char ch;
		 * 
		 * for(int i=0;i<str.length();i++) { ch=str.charAt(i); rts=ch+rts;
		 * System.out.println(rts); } System.out.println(rts);
		 */
		
		
		
	}

}
