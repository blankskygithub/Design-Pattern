package com.blanksky.designpattern.bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedCircle(), 10, 100, 100);
		Shape blueCircle = new Circle(new BlueCircle(), 5, 100, 100);
		
		redCircle.draw();
		blueCircle.draw();

	}

}
