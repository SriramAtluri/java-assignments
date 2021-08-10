package com.devlabs.lab8;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the First String:");
		String str1=scan.nextLine();
		
		System.out.println("Please Enter the First String:");
		String str2=scan.nextLine();
		
		scan.close();
		
		
		if(str1.equalsIgnoreCase(str2)) //Hello compared to hello
        {
             System.out.println("str1 is equal to str2"); 
        } 
        else
        {
             System.out.println("str1 is not equal to str2");
        }
       
		
		if(str1.compareToIgnoreCase(str2)==0) 
        {
          System.out.println("str1 is equal to str2 by compareTo"); 
        } 
        else
        {
         System.out.println("str1 is not equal to str2 by compareTo");
         }


	}

}
