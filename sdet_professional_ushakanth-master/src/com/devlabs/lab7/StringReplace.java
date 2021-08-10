package com.devlabs.lab7;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		
		System.out.println("Please enter the input String:");
		System.out.println("Ex: Pan Pun Prank Pit ");
		Scanner input=new Scanner(System.in);
		String str1=new String(input.nextLine());
		input.close();
		
		System.out.println("Entered String:"+str1);
		str1=str1.replace('P', 'F');
		
		System.out.println("\nNew String after replacing P with F is :"+str1);
		
	}

}
