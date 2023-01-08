package com.app.clone;

public class Department2 implements Cloneable{

	
	int deptId;
	String deptName;
	
	Department dept=new Department();
	
	public Department2()
	{
		
	}
	
	public Department2(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Department2 d2=(Department2) super.clone();
		d2.dept=new Department();
		
		return d2;
	}
	
}
