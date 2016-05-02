package com.sundance.algorithm.number;

public class Swap {

	public static void swap(int a, int b) {

		System.out.println("Before swap:" + "\ta = " + a + "\tb = " + b);

		a = b - a;
		b = b - a;
		a = a + b;

		System.out.println("After swap:" + "\ta = " + a + "\tb = " + b);

	}

	public static void swapXOR(int a, int b) {

		System.out.println("Before swap:" + "\ta = " + a + "\tb = " + b);

		a = b^a;
		b = b^a;
		a = a^b;

		System.out.println("After swap:" + "\ta = " + a + "\tb = " + b);

	}

	public static void main(String[] args) {

		swap(10, 5);
		swapXOR(10, 5);

	}
}
