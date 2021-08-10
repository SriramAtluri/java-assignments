package com.devlabs.assignment1;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {

		long num1, i = 0, factorial = 1;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number factorial to be Calculated\n");
		num1 = input.nextInt();
		input.close();

		if (num1 <= 0) {		// Check if the number is not Zero (or) Negative

			System.out.println("Factorial Can not be calculated for " + num1);
			System.out.println("Please enter valid number Greater than Zero");

		} else {

			for (i = 1; i <=num1; i++) {   
				factorial = factorial * i;
			}
			System.out.println("Factorial of the Number " + num1 + " is: " );
			System.out.println("------------------------");
			System.out.println(factorial);
			System.out.println("------------------------");

		}

	}

}
