package com.devlabs.lab2;

public class Product {

	// constructor

	public Product() {

		System.out.println("-----product1 object is created----");

	}

	public Product(int pid, int price, String name) {

		System.out.println("-----product2 object is created----");
		this.pid = pid;
		this.price = price;
		this.name = name;

	}

	// attributes (instance variables)
	int pid, price;
	String name;

	// behavior
	void setProductDetails(int pid, int price, String name) { // formal parameters
		// this here stands for local object
		// LHS is the instance variables , RHS is my values that i pass through
		// arguments (or) parameters

		// p1.set productDetails(45, 3500, "Machine")
		this.pid = pid;
		this.price = price;
		this.name = name;
		// LHS (object) = RHS (method)
	}

	void showProductDetails() {
		System.out.println("----------------------------");
		System.out.println("Product ID--" + pid);
		System.out.println("Price--" + price);
		System.out.println("Name--" + name);
		System.out.println("----------------------------");

	}

	public static void main(String[] args) {

		Product p1 = new Product();
		p1.setProductDetails(23, 3400, "Phone");
		p1.showProductDetails();

		Product p2 = new Product(55, 2500, "Television");
		// p1.setProductDetails(23, 3400, "Phone");
		p2.showProductDetails();

	}

}
