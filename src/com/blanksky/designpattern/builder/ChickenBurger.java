package com.blanksky.designpattern.builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 20.0f;
	}

}
