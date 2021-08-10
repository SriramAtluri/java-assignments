package com.devlabs.lab7;

import java.util.Scanner;
import java.util.*;

public class StringSort{

	
	public static void sortString(String[] arr) {

		String temp;
		int i, j, size = arr.length;

		for (i = 0; i < size ; i++) {
			for (j = i+1; j < size ; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
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
		System.out.println("Ex: Ciaz Alto Swift Dezire Brezza");

		
		
		for (i = 0; i < arr_size; i++) {
			arr[i] = input.next();
		}

		input.close();

		System.out.println("Entered Array Elemens are : ");
		for (i = 0; i < arr_size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\nArray after sort : ");
		sortString(arr);

		for (i = 0; i < arr_size; i++) {
			System.out.print(arr[i] + " ");
		}
		} else {
			
			System.out.println(" Size of the array is invalid!!!");
		}
		
	

	}

}
