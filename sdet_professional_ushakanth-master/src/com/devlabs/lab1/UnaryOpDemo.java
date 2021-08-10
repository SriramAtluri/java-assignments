package com.devlabs.lab1;

public class UnaryOpDemo {

	public static void main(String[] args) {

		int a = 5, b = 6;
		int m = 9, n = 3;

		int c = a++ + ++b;
		System.out.println("---------------");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		System.out.println("---------------");

		int d = ++a + b++ + a;

		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		System.out.println("---------------");
		System.out.println("Value of a: " + c);
		System.out.println("Value of b: " + d);
		System.out.println("---------------");
		int o = m-- + --n;

		System.out.println("Value of m: " + m);
		System.out.println("Value of n: " + n);
		System.out.println("---------------");

		System.out.println("Value of o: " + o);

		int i = 11;
		i = i++ + ++i;
		System.out.println("---------------");
		System.out.println("Value of i: " + i);
		System.out.println("---------------");

		i = i-- + --i;
		System.out.println("---------------");
		System.out.println("Value of i: " + i);
		System.out.println("---------------");

		i = i-- - --i;
		System.out.println("---------------");
		System.out.println("Value of i: " + i);
		System.out.println("---------------");

		i = --i - i--;
		System.out.println("---------------");
		System.out.println("Value of i: " + i);
		System.out.println("---------------");

	}

}
