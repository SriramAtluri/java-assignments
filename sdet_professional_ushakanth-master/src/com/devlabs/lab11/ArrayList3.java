package com.devlabs.lab11;

import java.util.*;

public class ArrayList3 {
     
    public static void main(String[] args) {
     
       //create an ArrayList object
            ArrayList<String> arrayList = new ArrayList<String>();
           
            //Add elements to Arraylist
            arrayList.add("A");
            arrayList.add("B");
            arrayList.add("C"); 
            arrayList.add("A");
            arrayList.add(4, "D");
            System.out.println("ArrayList contains...");  
            //display ArrayList elements using for loop
            for(int index=0; index < arrayList.size(); index++)
             System.out.println("Element at "  +index +" is " + arrayList.get(index));
          
      /*
       To remove an element from the specified index of ArrayList use
        Object remove(int index) method.
        It returns the element that was removed from the ArrayList. */
     
      //  Object obj = arrayList.remove(3); using index
            Object obj = arrayList.remove("D"); //using value
         System.out.println(obj + " is removed from ArrayList");
           
      System.out.println("ArrayList now contains...");
      //display ArrayList elements using for loop
        for(int index=0; index < arrayList.size(); index++)
        System.out.println(arrayList.get(index));
      
     
     }

    }