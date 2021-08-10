package com.devlabs.lab4;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		double num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number\n");
		num = input.nextDouble();
		input.close();

		if (num > 0) {

			System.out.println("Positive Number");
		} else if (num < 0) {

			System.out.println("Negative Number");
		} else if (num == 0) {
			System.out.println("Number is Zero");
		} else {
			System.out.println("Please enter proper number");
		}

	}

}
