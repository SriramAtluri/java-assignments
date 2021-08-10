package com.devlabs.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main (String args[]) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
        
        //Add elements to Arraylist
        arrayList.add("S");
        arrayList.add("O");
        arrayList.add("L"); 
        arrayList.add("U");
        arrayList.add(4, "T");
        arrayList.add(5, "I");
        arrayList.add(6,"O");
        arrayList.add(7,"N");
        System.out.println("ArrayList contains...");  
        //display ArrayList elements using for loop
        for(int index=0; index < arrayList.size(); index++)
        System.out.println("Element at "  +index +" is " + arrayList.get(index));
    
        Collections.reverse(arrayList);
        
        System.out.println("\n \n Reverse ArrayList contains...");  
        //display ArrayList elements using for loop
        for(int index=0; index < arrayList.size(); index++)
        System.out.println("Element at "  +index +" is " + arrayList.get(index));
    
	}
}
