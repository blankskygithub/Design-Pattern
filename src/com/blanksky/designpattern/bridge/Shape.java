package com.blanksky.designpattern.bridge;

public abstract class Shape {

	protected DrawAPI drawAPI;
	
	public Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
