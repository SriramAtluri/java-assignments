package com.devlabs.assignment1;

import java.util.Scanner;
import java.util.*;

public class ReverseArray {


	
	public static void reversefunc(String[] arr) {

		String temp;
		int i, size = arr.length;

		
			for (i = 0; i < size/2; i++) {
				temp = arr[size - (i + 1)];
				arr[size - (i+1)] = arr[i];
				arr[i] = temp;
			
		}
	}

	public static void main(String[] args) {

		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter size of the array\n");
		int arr_size = input.nextInt();
		
		if (arr_size>0) {
			
		String arr[] = new String[arr_size];
		System.out.println("Enter the values for the String  array");

		for (i = 0; i < arr_size; i++) {
			arr[i] = input.next();
		}

		input.close();

		System.out.println("Entered Array Elemens are : ");
		for (i = 0; i < arr_size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\nArray after reverse : ");
		reversefunc(arr);

		for (i = 0; i < arr_size; i++) {
			System.out.print(arr[i] + " ");
		}
		} else {
			
			System.out.println("Size of the array is invalid!!!");
		}
		
	

	}

}
