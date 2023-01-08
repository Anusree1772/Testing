package com.app.exception;

/**
 * @author Dell
 *
 */
public class ExceptionExample {

	
	public static void main(String[] args) throws ArithmeticException {
	    try {
	      System.out.println(50 / 0);
	    } catch (ArithmeticException e) {
	     
	      System.out.println("divide by 0");
	    }
	  }
	
}
