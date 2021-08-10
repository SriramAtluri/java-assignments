package com.devlabs.assignment3;

import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {

		System.out.println("Please enter the String: ");
		Scanner input = new Scanner(System.in);

		String palindrome_check_str = new String(input.nextLine());
		input.close();

		char arr[] = palindrome_check_str.toCharArray();
		int arr_size = arr.length;
		boolean flag_check = true;

		if (arr_size>0)
		{
		
		for (int i = 0; i < (arr_size / 2); i++) {

			if (arr[i] != arr[(arr_size - 1) - i]) {
				flag_check = false;
				break;
			}

		}

		if (flag_check) {
			System.out.println("Entered String :" + palindrome_check_str + " is PALINDROME");
		} else {
			System.out.println("Entered String :" + palindrome_check_str + " is not PALINDROME");
		}
		}
		
		else {
			System.out.println("Size of the string is not valid");
		}

	}

}
