package com.blanksky.designpattern.singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		
		//获取单例对象
		SingleObject object = SingleObject.getInstance();
		object.showMessage();

	}

}
