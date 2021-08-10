package com.devlabs.lab12;

import java.util.ArrayList;
import java.util.List;

public class JoinLists {

	public static void main(String[] args) {
		
		List<Comparable> al = new ArrayList<Comparable>(34);
		al.add("UK");  //add is the method for insertion
	    al.add(true);//boolean
	    al.add('v');  //char
	    al.add(null);  
	    al.add("sdfsdfds");//String
	    al.add(45354);//int
	    al.add(345);
	    al.add("Deepti");
	    al.add(454545454);
	    
	    List<Comparable> a2 = new ArrayList<Comparable>(11);
		a2.add("UK2");  //add is the method for insertion
	    a2.add(true);//boolean
	    a2.add('v');  //char
	    a2.add(null);  
	    a2.add("2sdfsdfds");//String
	    a2.add(2222);//int
	    a2.add(2121);
	    a2.add("2Deepti");
	    a2.add(12121);
	    
	    
	    al.addAll(a2);
	    
	    System.out.println("Joining Lists using addAll method" );
	    System.out.println(al); 
		
	}

}
