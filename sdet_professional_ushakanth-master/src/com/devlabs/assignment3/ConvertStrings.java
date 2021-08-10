package com.devlabs.assignment3;

public class ConvertStrings {

	public static void main(String[] args) {
		
		String str1="SRIRAM.ATLURI@BROADRIDGE.COM";
		System.out.println("Entered String is:  "+str1);
		
		char arr[]=str1.toCharArray();
		
		System.out.println("\nString after converted to character array:");
		for(char ch: arr) {
			System.out.print(ch+" ");
		}
		
		String str2=new String(arr);
		
		System.out.println("\n\nCharacter array after converted to String:\n"+str2);
		

	}

}
