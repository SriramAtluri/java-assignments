package com.devlabs.lab2;

public class SwapFloat {

	static float a, b;

	public SwapFloat(float a, float b) {
		this.a = a;
		this.b = b;
		
		System.out.println("-----------------------------------------");
		System.out.println("Iniatialized values are \n a:" + a + "\n b:" + b);
		System.out.println("-----------------------------------------");
		System.out.println();
		
	}

	public static void main(String[] args) {
		SwapFloat S1 = new SwapFloat(10.002f, 20.005f);

		S1.a = (a + b);
		S1.b = a - b;
		S1.a = a - b;
		
		System.out.println("-----------------------------------------");
		System.out.println("Values after swap \n a:" + a +"\n b:"+b);
		System.out.println("-----------------------------------------");
	}

}
