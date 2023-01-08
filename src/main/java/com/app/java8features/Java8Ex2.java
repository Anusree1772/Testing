package com.app.java8features;

@FunctionalInterface
interface Multiplier<T,U>
{
	int multiply(T a,U b);
}


public class Java8Ex2 {

	public static int execute(Multiplier<Integer,Integer> multiplier)
	{
		
		return multiplier.multiply(5, 10);
	}
	
	public static Multiplier<Integer,Integer> getMultiplier()
	{
		Multiplier<Integer,Integer> multiplier=(a,b)->a*b;
		
		return multiplier;
	}
	
	public static void main(String[] args) {
		
		Multiplier<Integer,Integer> multiplier=getMultiplier();
		
		int product=execute(multiplier);
		
		System.out.println(product);
	}
}
