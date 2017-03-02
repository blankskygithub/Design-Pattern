package com.blanksky.designpattern.abstractfactory;

public class Green implements Color {

	//具体产品类Green
	@Override
	public void fill() {
		System.out.println("Inside Green.fill() method");
	}

}
