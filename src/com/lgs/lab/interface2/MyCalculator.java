package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	private double a;
	private double b;

	public MyCalculator(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void plus() {
		System.out.println("\n"+"Plus: "+(a+b)+"\n"+"=========================");
	}

	@Override
	public void minus() {
		System.out.println("\n"+"Minus: "+(a-b)+"\n"+"=========================");

	}
	@Override
	public void devide() {

		System.out.println("\n"+"Devide: "+(a/b)+"\n"+"=========================");

	}

	@Override
	public void multiply() {
		System.out.println("\n"+"Multiply: "+(a/b)+"\n"+"=========================");

	}



}
