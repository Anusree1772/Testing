package com.app.reflection;

public class ReflectionApi {

	int i=20;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Class c=Class.forName("com.app.reflection.ReflectionApi");
		
		ReflectionApi obj=(ReflectionApi) c.newInstance();
		
		ReflectionApi obj1=(ReflectionApi) c.newInstance();
		
		System.out.println("hashcode:"+obj);
		
		System.out.println("hashcode:"+obj1);
		
		
	}
}
