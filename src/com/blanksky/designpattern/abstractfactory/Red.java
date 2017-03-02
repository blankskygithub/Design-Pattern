package com.blanksky.designpattern.abstractfactory;

public class Red implements Color {

	//具体产品类Red
	@Override
	public void fill() {
		System.out.println("Inside Red.fill() method");
	}

}
