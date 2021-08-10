package com.devlabs.lab4;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		double num1, num2, num3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();

		input.close();

		System.out.println("Numbers are " + num1 + "," + num2 + "," + num3 + "\n");

		if ((num1 > num2) && (num1 >num3)) {
				System.out.println(num1+" is greater");
		} else if ((num2 > num1) && (num2 >num3)) {
			System.out.println(num2+" is greater");
		} else if ((num3 > num1) && (num3 >num2)) {
			System.out.println(num3+" is greater");
		}else {
			System.out.println("There is no greater number among above 3");
		}
		
			
		
	}

}
