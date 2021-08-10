package com.devlabs.assignment1;

import java.util.Scanner;

public class FindLeapYear {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Year ");

		int year = input.nextInt();

		input.close();

		int leap_check = year % 4;
		int century_check = year % 100;
		int leap_century_check = year % 400;

		if (year > 0) {
			if (leap_check != 0) {
				System.out.println(year + " is not a Leap Year");
			} else {

				if (century_check != 0) {
					System.out.println(year + " is a Leap Year");
				} else {
					if (leap_century_check == 0) {
						System.out.println(year + " is a Leap Year");
					}

					else {
						System.out.println(year + " is not a Leap Year");
					}
				}
			}
		}

		else {
			System.out.println(year + " is Invalid!!!");
		}

	}

}
