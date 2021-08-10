package com.devlabs.assignment4;

import java.util.*;

public class MapToList {

	public static void main(String args[])
	
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(102, "Rahul"); 
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(104, "Deepti");
		hm.put(105, "Deepti");

		System.out.println("After invoking put() method " + hm);

		 ArrayList<Integer> keyList = new ArrayList<Integer>(hm.keySet());
	     ArrayList<String> valueList = new ArrayList<String>(hm.values());

	     System.out.println("\n \n contents of the list holding keys the map ::"+keyList);
	     System.out.println("\n \n contents of the list holding values of the map ::"+valueList);
		
	}

}
