package com.devlabs.assignment4;

import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {

		// create an ArrayList object
		ArrayList<String> arrayList = new ArrayList<String>();

		// Add elements to Arraylist
		arrayList.add("Europe");
		arrayList.add("Asia");
		arrayList.add("Australia");
		arrayList.add("North America");
		arrayList.add("South America");
		arrayList.add("Africa");

		System.out.println("ArrayList contains...");

		for (int index = 0; index < arrayList.size(); index++)
			System.out.println("Element at " + index + " is " + arrayList.get(index));

		arrayList.sort(null);
		
		System.out.println("\n \n Array List after sort");
		for (int index = 0; index < arrayList.size(); index++)
			System.out.println("Element at " + index + " is " + arrayList.get(index));

		
		
	}

}
