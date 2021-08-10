package com.devlabs.lab13;

import java.util.HashSet;
import java.util.Iterator;  
public class HashSetSize{  
    public static void main(String args[])
    {  
        //maintains no order
        HashSet<String> set=new HashSet<String>(); 
        //add()
        
           set.add("Mayank");  
           set.add("Apoorv");  
           set.add("Lokesh");  
           set.add("Abhishek");
           set.add("Ankur");
           set.add("Shaishav");
          
           
           System.out.println("List of elements: "+ set); 
           
           
           System.out.println("\n\nSize of the hash set: "+set.size());
 
    }
}  
  

