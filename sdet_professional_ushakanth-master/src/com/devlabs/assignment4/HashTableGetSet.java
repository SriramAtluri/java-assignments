package com.devlabs.assignment4;

import java.util.*;

public class HashTableGetSet {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Athens");
		map.put(102, "Dina");
		map.put(111, "George");
		map.put(103, "Zen");

		Set<Integer> keys = map.keySet();

		for (int i : keys) {
			System.out.println("For key " + i + ", the value is: " + map.get(i));

		}

	}
}
