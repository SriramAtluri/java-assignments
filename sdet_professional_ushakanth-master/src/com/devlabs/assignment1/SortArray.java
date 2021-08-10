package com.devlabs.assignment1;

import java.util.Scanner;
import java.util.*;

public class SortArray {

	public static void sortfunc(int[] arr) {

		int i = 0, j = 1, temp = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = 1; j < (arr.length - i); j++) {

				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {

		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter size of the array\n");

		int arr_size = input.nextInt();
		int arr[] = new int[arr_size];
		System.out.println("Enter the values for the integer array");

		for (i = 0; i < arr_size; i++) {
			arr[i] = input.nextInt();
		}

		input.close();

		System.out.println("Entered Array Elemens are : ");
		for (i = 0; i < arr_size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n\nArray after sort [ascending order]: ");
		sortfunc(arr);

		for (i = 0; i < arr_size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
