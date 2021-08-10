package com.devlabs.assignment3;

import java.text.ParseException;
import java.util.*;

public class NumberFormatException {

	public static void main(String[] args) throws ParseException {

		try {
			System.out.println("Enter Integer Input:");
			Scanner input = new Scanner(System.in);
			String str1 = input.nextLine();
			input.close();
			int a1 = Integer.parseInt(str1);

			System.out.println("entered input :" + a1);
		} catch (Exception e) {
			System.out.println("Number Format Exception while parsing String to integer " + e.getMessage());

		}

	}

}
