package com.blanksky.designpattern.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(circle);

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		circle.draw();
		System.out.println("\n");
		redCircle.draw();
		System.out.println("\n");
		redRectangle.draw();
		System.out.println("\n");
	}

}
