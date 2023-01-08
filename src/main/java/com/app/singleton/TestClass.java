package com.app.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClass {

	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		
		SingletonEx obj1=SingletonEx.getInstance();
		
		SingletonEx obj2=SingletonEx.getInstance();
		
		System.out.println("hashcode:"+obj1);
		
		System.out.println("hashcode:"+obj2);
		
		Constructor<SingletonEx> constructor=SingletonEx.class.getDeclaredConstructor();
		
		constructor.setAccessible(true);
		
		SingletonEx obj3=constructor.newInstance();
		
		System.out.println("hashcode:"+obj3);
	}
}
