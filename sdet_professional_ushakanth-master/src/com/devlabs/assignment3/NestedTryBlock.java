package com.devlabs.assignment3;

public class NestedTryBlock {

	public static void numericexception() {

		try {
			System.out.println("Division");
			int res = 100 / 0;
		} catch (ArithmeticException ex2) {
			System.out.println("Sorry! Division by zero isn't feasible!");
		}

	}

	public static void main(String[] args) {
		try {
			int a[] = new int[10];
			// displaying element at index 45
			System.out.println(a[45]);
			// another try block
			try {
				System.out.println("Division");
				int res = 100 / 0;
			} catch (ArithmeticException ex2) {
				System.out.println("Sorry! Division by zero isn't feasible!");
			}
		} catch (ArrayIndexOutOfBoundsException ex1) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

		finally {

			System.out.println("numeric Exception from Finally block");
			numericexception();
		}

	}

}
