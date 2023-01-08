package com.app;

public class Test {
	
	public static void main(String[] args) {
		
		String str1="scaler";
		String str2=new String("scaler");
		
		System.out.println(str1==str2);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.equals(str2));
		
		Test t=new Test();
		System.out.println(t.hashCode());
		System.out.println(t.toString());
	}

}
