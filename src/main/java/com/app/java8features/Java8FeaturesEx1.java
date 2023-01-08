package com.app.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8FeaturesEx1 {
	
	
	public static void main1(String[] args) {
		
		int [] array=new int[] {1,2,3,4,5};
		
		int [] evenArray=Arrays.stream(array)
				.filter(a->a%2==0)
				.toArray();
		
		System.out.println(Arrays.toString(evenArray));
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		int sum=list.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}

}
