package com.app.javaio;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaOutputStream {

	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream f=new FileOutputStream("Output.txt ");
		
		String s="FileOutputStream";
		
		char ch[]=s.toCharArray();
		int x=0;
		
		while(x<s.length())
		{
			f.write(ch[x++]);
		}
		
		f.close();
	}
}
