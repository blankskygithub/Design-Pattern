package com.blanksky.designpattern.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType){
		if(factoryType.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}else if(factoryType.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
