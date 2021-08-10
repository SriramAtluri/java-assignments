package com.devlabs.lab1;

public class QuotientRemainder {

	public static void main(String[] args) {

		int value1 = 10, value2 = 3;

		int quotient = value1 / value2;
		int remainder = value1 % value2;

		System.out.println("Numbers are " + value1 + " & " + value2);
		System.out.println("Quotient is :" + quotient);
		System.out.println("remainder is " + remainder);

		double value3 = 12.50, value4 = 2.5;

		double quotient2, remainder2;
		quotient2 = value3 / value4;
		remainder2 = value3 % value4;

		System.out.println("\nNumbers are " + value3 + " & " + value4);
		System.out.println("Quotient is :" + quotient2);
		System.out.println("remainder is " + remainder2);

	}

}
