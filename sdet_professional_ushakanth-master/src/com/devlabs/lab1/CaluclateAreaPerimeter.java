package com.devlabs.lab1;

public class CaluclateAreaPerimeter {

	public static void main(String[] args) {

		double length = 10.25, breadth = 15.412, area, perimeter;

		area = length * breadth;
		perimeter = 2 * (length + breadth);

		System.out.println("Dimensions of Rectangle Length: " + length + "  Breadth:" + breadth);

		System.out.println("Area of Rectangle is : " + area);
		System.out.println("Perimeter of Rectangle is : " + perimeter);

	}

}
