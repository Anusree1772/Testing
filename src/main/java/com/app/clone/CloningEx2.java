package com.app.clone;

public class CloningEx2 {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Department2 d=new Department2();
		
		d.deptId=100;
		d.deptName="It";
		
		d.dept.deptId=200;
		d.dept.deptName="CSE";
		
		Department2 d2=(Department2) d.clone();
		
		d2.deptId=300;
		d2.dept.deptId=400;
		
		System.out.println(d);
		System.out.println(d2);
		
		System.out.println(d.deptId+" "+d.deptName+" "+d.dept.deptId+" "+d.dept.deptName);
		
		System.out.println(d2.deptId+" "+d2.deptName+" "+d2.dept.deptId+" "+d2.dept.deptName);
	}
}
