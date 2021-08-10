package com.devlabs.lab10;

public class HandleMultipleExceptions {

	static class FirstExceptionDemo extends Exception {

		public FirstExceptionDemo(String msg) {
			super(msg);
		}
	}

	static class SecondExceptionDemo extends Exception {

		public SecondExceptionDemo(String msg) {
			super(msg);
		}
	}

	static class ThirdExceptionDemo extends Exception {

		public ThirdExceptionDemo(String msg) {
			super(msg);
		}
	}

	static void exceptionthrow(String s) throws FirstExceptionDemo, SecondExceptionDemo, ThirdExceptionDemo {
		try {
			if (s.equals("First"))
				throw new FirstExceptionDemo("Exception Received from : First ");
			else if (s.equals("Second"))
				throw new SecondExceptionDemo("Exception Received from : Second");
			else
				throw new ThirdExceptionDemo("Exception Received from : Third");
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			exceptionthrow("abc");
		} catch (FirstExceptionDemo | SecondExceptionDemo | ThirdExceptionDemo e) {
			System.out.println(e.getMessage());
		}
		try {
			exceptionthrow("First");
		} catch (FirstExceptionDemo | SecondExceptionDemo | ThirdExceptionDemo e) {
			System.out.println(e.getMessage());
		}

		try {
			exceptionthrow("Second");
		} catch (FirstExceptionDemo | SecondExceptionDemo | ThirdExceptionDemo e) {
			System.out.println(e.getMessage());
		}

	}

}
