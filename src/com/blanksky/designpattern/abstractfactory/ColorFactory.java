package com.blanksky.designpattern.abstractfactory;

public class ColorFactory extends AbstractFactory {

	//具体工厂类ColorFactory
	@Override
	public Color getColor(String colorType) {
		if(colorType == null){
			return null;
		}
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		}else if(colorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		}else if(colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
