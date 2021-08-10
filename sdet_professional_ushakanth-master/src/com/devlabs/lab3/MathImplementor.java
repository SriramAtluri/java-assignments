package com.devlabs.lab3;

import java.util.*;

public class MathImplementor implements MathsInterface, PrimeInterface {

	public void add(int a, int b) {
		System.out.println("The sum is:" + (a + b));
	}

	public void subtract(int a, int b) {
		System.out.println("The difference is:" + (a - b));
	}

	public void multiply(int a, int b) {
		System.out.println("The product is:" + (a * b));
	}

	public void divide(int a, int b) {
		System.out.println("The quotient is:" + (a / b));
	}

	public void checkPrime(int a) {

		int i, m = 0, flag = 0;
		m = a / 2;

		if (a == 0 || a == 1) {
			System.out.println(a + " is not prime number");
		} else {
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

		System.out.println("PrimeCheck");
	}

	public static void main(String[] args)

	{ // TODO Auto-generated method stub

		MathImplementor m = new MathImplementor();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();

		System.out.println("Enter the second number:");
		int b = scan.nextInt();

		scan.close();

		m.add(a, b);
		m.subtract(a, b);
		m.multiply(a, b);
		m.divide(a, b);

		m.checkPrime(a);

	}

}