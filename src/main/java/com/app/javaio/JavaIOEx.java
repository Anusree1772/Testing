package com.app.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaIOEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		 try {
		
		FileInputStream f=new FileInputStream("C:\\Users\\Dell\\Documents\\workspace-2\\Testing\\src\\main\\resources\\input.txt");
		
		int x = 0;
	      // while loop until the end of the file.
	      while ((x = f.read()) != -1) {

	    	  
	        System.out.print((char) x);
	      }
	      // closing a file
	      f.close();
	    } catch (Exception e) {
	      // printing exception
	      System.out.println(e);
	    }
		
	}

}
