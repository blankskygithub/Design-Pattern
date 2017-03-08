package com.blanksky.designpattern.bridge;

public class Circle extends Shape {

	private int x,y,radius;
	
	public Circle(DrawAPI drawAPI,int radius,int x,int y) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
