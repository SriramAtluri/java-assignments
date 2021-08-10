package com.devlabs.assignment3;

public class ReThrowException {

	public static void throw1() throws Exception {

		System.out.println("The Exception in throw1() method");
		throw new Exception("thrown from throw1() method");

	}

	public static void throw2() throws Throwable {
		try {
			throw1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception from throw2() method");
			throw e;
		}
	}

	public static void main(String[] args) throws Throwable {
		try {
			throw2();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Caught in main");
		}
	}

}
