package com.blanksky.designpattern.abstractfactory;

public class Blue implements Color {

	//具体产品类Blue
	@Override
	public void fill() {
		System.out.println("Inside Blue.fill() method");
	}

}
