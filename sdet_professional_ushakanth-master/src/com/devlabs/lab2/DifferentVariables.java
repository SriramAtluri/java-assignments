package com.devlabs.lab2;

public class DifferentVariables {

	private static int staticVar = 10;
	private int instanceVar = 11;

	public DifferentVariables() {
	}

	public DifferentVariables(int val) {
		this.instanceVar = val;
	}

	public static void main(String[] args) {
		int localVar = 12;
		System.out.println(localVar);
		System.out.println(DifferentVariables.staticVar);

		DifferentVariables diffVar = new DifferentVariables();
		System.out.println(diffVar.instanceVar);
		System.out.println(DifferentVariables.staticVar);

		DifferentVariables diffVar1 = new DifferentVariables(15);
		System.out.println(diffVar1.instanceVar);

	}
}
