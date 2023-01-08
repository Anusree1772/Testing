package com.app.java8features;

import java.util.function.Predicate;

public class Java8Ex3 {

	
	public static void main(String[] args) {
		Predicate<Integer> isDividibleByTwo=(value)->value%2==0;
		
		Predicate<Integer> isDivisibleByFive=(value)->value%5==0;
		
		Predicate<Integer> isDivisibleByTwoAndFive=isDividibleByTwo.and(isDivisibleByFive);
		
		System.out.println("10 is divisible by 2 and 5"+isDivisibleByTwoAndFive.test(10));
		
		System.out.println("4 is divisible by 2 and 5"+isDivisibleByTwoAndFive.test(4));
		
		Predicate<Integer> isDivisibleByTwoAOrFive=isDividibleByTwo.or(isDivisibleByFive);
		
		System.out.println("3 is divisible by 2 or 5"+isDivisibleByTwoAOrFive.test(3));
		
		System.out.println("4 is divisible by 2 or 5"+isDivisibleByTwoAOrFive.test(4));
		
		System.out.println("--- negate() ---");
        System.out.println("2 divisible by 2: " 
                           + isDividibleByTwo.negate().test(2));
        
        System.out.println("--- isEqual() ---");
        
        System.out.println("Tony equal to Stark: " +Predicate.isEqual("Tony").test("Stark"));

        Predicate<String> s=Predicate.isEqual("Tony");
        System.out.println(s.test("Stark"));
        
        
        
      //  System.out.println("isEqual"+);
	}
}
