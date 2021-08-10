package com.devlabs.lab8;

import java.util.Scanner;

public class StringAppend {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the First String:");
		String str1=scan.nextLine();
		scan.close();
		
		
		StringBuilder str1_concat_builder = new StringBuilder(str1);
        str1_concat_builder.append("Builder");
        System.out.println("***********");
        System.out.println("StringBuilder Append :" +str1_concat_builder);
        System.out.println("***********");
        
        StringBuffer str1_concat_buffer = new StringBuffer("String ");
        str1_concat_buffer.append("Buffer");
        
        System.out.println("***********");
        System.out.println("StringBuffer Append :" +str1_concat_buffer);
        System.out.println("***********");
        
		

	}

}
