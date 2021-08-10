package com.devlabs.lab1;

public class DataTypesExample {

	public static void main(String[] args) {
		int item_id = 1, quantity; // default value=0
		double price, discount = 2, total_amount = 3; // defaul value=0.0
		boolean memberCheck; // default value = FALSE
		String comments = "Welcome to Our store"; // default value = NULL & user double quotes always
		char c = '&'; // single quotes

		System.out.println("o/p is  " + item_id + " " + discount);
		System.out.println("o/p is  " + total_amount + " " + discount);

		System.out.printf("o/p is %d, %f ", item_id, discount);

		System.out.println(" ");

	}

}
