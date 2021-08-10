package com.devlabs.assignment3;
import java.util.*;

public class CheckString {

	public static void main(String[] args) {
		
		String sb1=new String("A brown fox ran away fast");
		String str_check="brown";
		String str_check2="Brown";
		
		System.out.println("Entered String: "+sb1);
		
		if(sb1.contains(str_check)) {
			
			System.out.println(str_check+" is found");
		}else {
			System.out.println(str_check+" is not found");
		}
			
		if(sb1.contains(str_check2)) {
			
			System.out.println(str_check2+" is found");
		}else {
			System.out.println(str_check2+" is not found");
		}
		
		
	}

}
