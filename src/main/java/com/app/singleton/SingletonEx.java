package com.app.singleton;

public class SingletonEx {

	private static SingletonEx instance=null;
	
	private static boolean isNew=true;
	
	int i=20;
	
	private SingletonEx()
	{
		if(isNew)
		{
			isNew=false;
		}
		else
		{
			throw new InstantiationError("Cannot create multiple objects");
		}
	}
	
	public static SingletonEx getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonEx();
		}
		return instance;
	}
}
