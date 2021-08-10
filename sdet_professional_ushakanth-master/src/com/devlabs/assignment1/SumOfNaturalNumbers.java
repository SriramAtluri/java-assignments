package com.devlabs.assignment1;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		int i = 0, sum = 0 ;

		while (i <= 20) {
			sum += i;
			i++;
		}

		System.out.println("Sum of first "+(i-1)+" Natural numbers is : " + sum);

	}

}
