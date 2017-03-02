package com.blanksky.designpattern.abstractfactory;

public abstract class AbstractFactory {
	
	//抽象工厂类
	public abstract Color getColor(String colorType);
	public abstract Shape getShape(String shapeType);
}
