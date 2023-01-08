package com.app.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialization implements Serializable{

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  public String stu_Name;
	  public String stu_Addr;
	  public int stu_Id;
	  
	  public static void main(String[] args) {
		
		  ObjectSerialization student=new ObjectSerialization();
		  
		  student.stu_Name = "George";
		  student.stu_Addr = "ABC,XYZ";
		  student.stu_Id = 1;
		  ObjectSerialization deserializedStudent;
		  try
		  {
			  FileOutputStream fileOut = new FileOutputStream("storeObject.txt");
			  
			  ObjectOutputStream out=new ObjectOutputStream(fileOut);
			  out.writeObject(student); 
			  
			  System.out.println("before"+student);
			  
			  out.close();
			  fileOut.close();
			  System.out.println("Object serialized");
			  
			  FileInputStream fileIn=new FileInputStream("storeObject.txt");
			  ObjectInputStream in=new ObjectInputStream(fileIn);
			  
			  deserializedStudent=(ObjectSerialization)in.readObject();
			  
			  in.close();
		      fileIn.close();

		      // Printing the deserialized object.
		      
		      System.out.println("after"+deserializedStudent);
		      System.out.println("Deserialized Student...");
		      System.out.println("Name: " + deserializedStudent.stu_Name);
		      System.out.println("Address: " + deserializedStudent.stu_Addr);
		  }
		  catch(IOException i)
		  {
			  
			  i.printStackTrace();
		  } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
