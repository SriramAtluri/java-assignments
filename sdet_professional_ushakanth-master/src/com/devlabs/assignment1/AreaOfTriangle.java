package com.devlabs.assignment1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Base and Height values of the triangle\n");
		double base, height, area;
		
		base=input.nextDouble();
		height=input.nextDouble();

		input.close();
		
		area = (0.5) * base * height;
		
		System.out.println("triangle dimensions are base:"+base+" & height:"+height);
		System.out.print("Area is:"+area);
	}

}
