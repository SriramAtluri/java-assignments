package com.devlabs.assignment4;

import java.util.*;

public class CopyHashSetToArray {

	public static void main(String args[]) {
		// create hashSet object
		HashSet<Integer> hashSet = new HashSet<Integer>();

		// add elements to hashSet
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(6);
		hashSet.add(7);
		hashSet.add(8);
		hashSet.add(9);
		hashSet.add(10);

		System.out.println("Hashset elements are :"+hashSet);
		
		Object[] objArray = hashSet.toArray();
		System.out.println("Hashset elements are copied into an Array. Now Array Contains..");

		for (int index = 0; index < objArray.length; index++)
			System.out.print(" " + objArray[index]);
	}

}
