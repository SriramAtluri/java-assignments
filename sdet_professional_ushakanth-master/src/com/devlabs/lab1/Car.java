package com.devlabs.lab1;

//Car Class
public class Car {

	static int tyres = 4; // instance variables - for every instance, there will be a copy of instance
							// variables. //object level
	int price; // object level'
	int speed = 10;

	// static variables, - I dont need an object, but for instance variables, I need
	// an object to display the value.

	public void display(String m) {
		String model = m; // local variable
		System.out.println("Model of the car is " + m);
		System.out.println("Speed of Instace variable is " + speed);
	}

	
	public static void main(String[] args) {

		Car c = new Car(); // creation of object
		c.display("Audi"); // method call
		c.price = 50000;
		c.speed = 250;
		c.tyres = 3; // Not recommended

		System.out.println("price is " + c.price);
		System.out.println("speed is " + c.speed);
		System.out.println("Tyres are " + Car.tyres);

		System.out.println();
		System.out.println();

		Car c1 = new Car();
		c1.display("Tesla");
		c1.price = 600000000;
		c1.speed = 200;

		System.out.println("price is " + c1.price);
		System.out.println("speed is " + c1.speed);
		System.out.println("Tyres are " + c1.tyres);
	}

	
}
