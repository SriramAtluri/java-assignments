package com.devlabs.assignment1;

import java.util.Scanner;

public class FirstTenPrimeNumbers {

	public static int primecheck(int a) {

		int i, m = 0, flag = 0;
		m = a / 2;

		for (i = 2; i <= m; i++) {
			if (a % i == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.print(a + " ");
			return 1;
		}

		else {
			return 0;
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the number of prime numbers you want \n");  //Enhanced the program to print as many number of prime numbers instead of only 10.
		int a = 2, counter = 1, range; 

		Scanner input = new Scanner(System.in);
		range = input.nextInt();
		input.close();

		if (range>0)
		{	
		
		while (counter <= range) {

			int retst = primecheck(a);

			if (retst == 1) {
				counter++;
				a++;
			} else {
				a++;
			}

		}
		
		} else {
			
			System.out.println("Range "+range+" is INVALID!!");
		}

	}

}