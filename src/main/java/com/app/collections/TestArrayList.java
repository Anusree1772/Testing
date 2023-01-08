package com.app.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TestArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Scaler");
        str.add("Topics");
        str.add("Rocks");
  Map<String,Integer> p=new HashMap<String, Integer>();
  
  Set<String> pr=new HashSet<>();
  
  Hashtable<String,Integer> r=new Hashtable<>();
 
        // to print the ArrayList
        System.out.println("ArrayList is" + str);
	}
}
