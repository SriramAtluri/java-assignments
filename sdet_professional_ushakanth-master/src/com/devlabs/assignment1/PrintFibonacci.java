package com.devlabs.assignment1;

import java.util.Scanner;

public class PrintFibonacci {

	public static void printseries(int n) {
		
		int  val1 = 0, val2 = 1, sum = 0;
		
		for (int j  = 1; j <= n; j++) {
			System.out.print(val1 ) ;
			sum = val1 + val2;
			val1 = val2;
			val2 = sum;

			if (j!=n) {
				System.out.print(", ");
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {

		int i = 0, val1 = 0, val2 = 1, sum = 0;

		System.out.println("First 10 values of fibonacci series are : \n");

		for (i = 1; i <= 10; i++) {
			System.out.print(val1 ) ;
			sum = val1 + val2;
			val1 = val2;
			val2 = sum;

			if (i!=10) {
				System.out.print(", ");
			}
			
		}
		
		// additional program
	
		int n;
		
		System.out.println("\n\n-------- Additional Case-------------------------");
		System.out.println("Enter how many values of fibonacci series to be printed: ");
		System.out.println("------------------------------------------------\n");
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		input.close();

		
		if (n>0) {
			printseries(n);
		} else {
			System.out.println(n+" is invalid");
		}
			
		

	}

}
