package com.devlabs.lab7;

public class CountOfCharacters {

	public static void count(String str1) {

		char arr[] = str1.toCharArray();

		System.out.println("Entered String:");
		for (char ch : arr) {
			System.out.print(ch);
		}

		System.out.println("\n");
		System.out.println("*** Upper case characters in above string : ");

		int counter_upper = 0;

		for (int i = 0; i < arr.length; i++) {

			if (Character.isUpperCase(arr[i])) {
				System.out.print((arr[i]) + " ");
				counter_upper++;
			}

		}

		System.out.println("\nCount of Upper characters :" + counter_upper);

		System.out.println("\n \n*** Lower case characters in above string : ");
		int counter_lower = 0;
		for (int i = 0; i < arr.length; i++) {

			if (Character.isLowerCase(arr[i])) {
				System.out.print((arr[i]) + " ");
				counter_lower++;
			}

		}

		System.out.println("\nCount of lower characters :" + counter_lower);

		System.out.println("\n \n*** digits  in above string : ");
		int counter_digits = 0;
		for (int i = 0; i < arr.length; i++) {

			if (Character.isDigit(arr[i])) {
				System.out.print((arr[i]) + " ");
				counter_digits++;
			}

		}

		
		System.out.println("\nCount of digits :" + counter_digits);

		
		
	}

	public static void main(String[] args) {

		String str1 = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";

		count(str1);

	}

}
