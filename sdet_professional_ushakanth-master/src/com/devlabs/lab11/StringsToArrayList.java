package com.devlabs.lab11;

import java.util.*;

public class StringsToArrayList {

	public static void main(String[] args)
    {  
        String[] words = {"hi", "boom", "hello", "friend", "dear"};  
        
        //Arrays has a static method called asList() to convert an array into List
        List<String> list = Arrays.asList(words);  
        
        System.out.println("As a list:" +list);
    
        for (String e : words)  {  
            System.out.print(" "+e);  
        }

	}
}
