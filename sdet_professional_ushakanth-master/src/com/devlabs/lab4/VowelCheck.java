package com.devlabs.lab4;
import java.util.*;

public class VowelCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		 char vowcheck = scan.next().charAt(0);
		  scan.close();
		   
		   switch(vowcheck)
		   {
		        case 'a':
		        case 'A':
		        case 'e':
		        case 'E':
		        case 'i':
		        case 'I':
		        case 'o':
		        case 'O':
		        case 'U':
		        case 'u':System.out.println("You have entered Vowel");  break; 
		        default: //&, @
		            System.out.println("You have entered Constant");
		   }
		   
	}

}
