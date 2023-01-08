package com.app.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception2Example {

	public static void fileCheck() throws IOException {
	    
	      File file1 = new File("sample.txt");
	      FileInputStream fstream = new FileInputStream(file1);
	    
	  }
	  public static void main(String[] args) {
	    try {
	      fileCheck();
	    } catch (IOException e) {
	      //The propagated exception is caught again here
	      System.out.print(e);
	    }
	  }
	
}
