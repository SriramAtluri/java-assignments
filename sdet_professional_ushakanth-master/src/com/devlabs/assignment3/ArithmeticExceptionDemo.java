package com.devlabs.assignment3;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int a = 0, b = 4;
		int c = 0;
		try {
			c = b / a;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Printing the stack trace.\n"
					+ "ArithmeticException is handled. But take care of the variable \"c\"");
		}
		System.out.println("Value of c : " + c);

	}

}
