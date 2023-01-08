package com.app.clone;

public class CloningEx {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department2 d1=new Department2(1,"It");
		
		System.out.println("ID of d1:"+d1.deptId);
		
		System.out.println("Name of d1:"+d1.deptName);
		
		Department2 d2=(Department2) d1.clone();
		System.out.println("Before Changing Values");
		System.out.println("ID of d2:"+d2.deptId);
		
		System.out.println("Name od d2:"+d2.deptName);
		System.out.println("ID of d1:"+d1.deptId);
		
		System.out.println("Name of d1:"+d1.deptName);
		
		d2.deptId=2;
		d2.deptName="Cse";
		
		System.out.println("After Changing Values");
		System.out.println("ID of d2:"+d2.deptId);
		
		System.out.println("Name od d2:"+d2.deptName);
		System.out.println("ID of d1:"+d1.deptId);
		
		System.out.println("Name of d1:"+d1.deptName);
		
	}
}
