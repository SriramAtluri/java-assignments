package com.devlabs.lab1;

public class RetailStoreOperatorEx {

	public static void main(String[] args) {

		int itemA = 200, itemB = 80, itemC = 150;
		double total_amount;
		boolean membercheck = false; 
		total_amount = ((3 * itemA) + (5 * itemB) + (2 * itemC));

		double discount = 0.15 * total_amount;

		total_amount = total_amount - discount;
		total_amount = total_amount + (0.02 * total_amount);

		System.out.println("\nDear Customer:");
		
		System.out.println("---------------");
		System.out.println("Item  : Price ");
		System.out.println("---------------");
		System.out.println("itemA : " + itemA + "\nitemB : " + itemB+ "\nitemC : " + itemC);
		System.out.println("---------------");
		System.out.println("\nYour Bill Amount is : " + total_amount);

		if ((total_amount >= 1000) || (membercheck==true)) {

			
			System.out.println("\nThank you for shopping with us , you are eligible for a gift");
			System.out.println("Please visit again !!! ");
		} else {

			System.out.println("\nThank you for visiting the store");
			System.out.println("Please visit again !!! ");
		}

	}

}
