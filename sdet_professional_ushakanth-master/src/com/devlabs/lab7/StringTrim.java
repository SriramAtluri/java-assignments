package com.devlabs.lab7;
import java.util.Scanner;

public class StringTrim {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the String:");
		System.out.println("Ex:   She sells sea shells on the sea shore ");
		String s1=scan.nextLine();
		scan.close();
		
		String s2= s1.trim();
		
		System.out.println("\n\nBefore Trim:"+s1);
		System.out.println("After Trim :"+s2);
		
		
		
		String str1 = " She sells sea shells on the sea shore ";
		String str2= str1.trim();
		
		System.out.println("\n\nBefore Trim:"+str1);
		System.out.println("After Trim :"+str2);
		
        

	}

}
