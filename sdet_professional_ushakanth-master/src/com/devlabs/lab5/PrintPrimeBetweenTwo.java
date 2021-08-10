package com.devlabs.lab5;

import java.util.Scanner;

public class PrintPrimeBetweenTwo {

	public static void primecheck(int a) {
//		System.out.println("a value is:"+a);
		int i, m = 0, flag = 0;
		m = a / 2;
		if (a == 0 || a == 1) {
			//System.out.println(a + " is not prime number");
		} else {
//			System.out.println("m value is:"+m);
		
			for (i = 2; i <= m; i++) {
				if (a % i == 0) {
					flag = 1;
					break;
				}
			}
			
			if (flag == 0) {
				System.out.println(a + " is prime number");
			}
		}

		
	}


	public static void main(String[] args) {
		int num1, num2, a=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();

		input.close();

		if (num1 > 0 && num2 > 0) {
			if (num1 == num2) {
				System.out.println("Range is invalid");
			} else {
				if (num1>num2) {
					for (a = num2; a <=num1; a++) {
						primecheck(a);
					}
				}
				else {
					for (a = num1; a <= num2; a++) {
						primecheck(a);
					}	
				}
				
			}
		} else {
			System.out.println("Range is not proper");
		}

	}
}
