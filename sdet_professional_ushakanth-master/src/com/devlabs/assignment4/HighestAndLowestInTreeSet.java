package com.devlabs.assignment4;

import java.util.Iterator;
import java.util.TreeSet;

public class HighestAndLowestInTreeSet {

	  public static void main(String args[])
	    {
	        
	        TreeSet<Integer> set = new TreeSet<Integer>(); 
	        set.add(11);
	        set.add(23);
	        set.add(28);
	        set.add(91);
	        set.add(100);
	        set.add(40);
	        set.add(60);
	        set.add(12);
	        
	        System.out.println("Elements of the treeset are: " + set);
	        System.out.println("Traversing elements through Iterator");
	        
	        Iterator<Integer> i = set.iterator();
	        while (i.hasNext()) {
	            System.out.print(" " + i.next());
	        }
	        
	        System.out.println("\nLowest Value in Tree set is "+set.first());
	        System.out.println("Highest Value in Tree set is "+set.last());
	    }

	
}
