package com.devlabs.assignment1;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String arr[][] = new String[10][10];
		int i,j;

		for (i = 0; i < 10; i++) {
			for (j = 0; j <= i; j++) {
				arr[i][j] = "O";
			}
		}

		System.out.println("----- Triangle Array Output2 ---");

		for (i = 0; i < 10; i++) {

			for (j = i; j < 10; j++) {
				System.out.print(" " );
			}

			for (j = 0; j <= i; j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
			
		
		}

	}
}
