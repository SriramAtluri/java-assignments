package com.devlabs.lab10;

class UserExceptionDemo extends Exception {

	int user_val_main;

	UserExceptionDemo(int b) {
		user_val_main = b;
	}

	public String toString() {
		return ("User Defined exception : num2 value is=  " + user_val_main);
	}

}

public class UserDefinedException {

	public static void main(String[] args) {

		System.out.println("User Defined Exception Demo:");
		int num1 = 24, num2 = 12, num3 = 0;

		try {

			System.out.println("num1/num2 =" + (num1 / num2));
			throw new UserExceptionDemo(num2);

		} catch (UserExceptionDemo e) {
			System.out.println(e);
		}

		try {
			System.out.println("num1/num3 =" + (num1 / num3));
		}

		catch (ArithmeticException ae) // catch(Exception e)
		{
			ae.printStackTrace();
			ae.toString();
		}
	}
}
