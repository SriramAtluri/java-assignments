package com.devlabs.lab5;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Number :\n ");
        
        int num = reader.nextInt();
        reader.close();
        
        for (int i = 1; i <= 10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
			
		}

		
	}

}
