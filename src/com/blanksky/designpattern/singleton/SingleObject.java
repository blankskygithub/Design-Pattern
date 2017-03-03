package com.blanksky.designpattern.singleton;

public class SingleObject {

	private static SingleObject instance = new SingleObject();
	
	//构造函数为private，保证无法在类外创建实例对象
	private SingleObject(){
		
	}
	//在类外得到实例对象
	public static SingleObject getInstance(){
		return instance;
	}
	
	/*惰性加载：在使用该实例时，进行创建单例实例
	private static SingleObject instance = null;
	
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		if(instance == null){
			instance = new SingleObject();
		}
		return instance;
	}*/
	
	
	/*多线程情况下，单例模式
	private static SingleObject instance = null;
	
	//为保证多线程情况下仍满足单一实例要求，新建同步对象，对线程进行锁操作
	private static final Object synObject = new Object();
	
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		//Double-Check:两次判断instance是否为null
		//第一次检查可以去掉，但去掉之后，每当有线程企图再次创建单例实例时，需要进行锁定操作,消耗性能大于判断instance是否为null
		if(instance == null){
			synchronized (synObject) {
				//第二次检查不可以去掉，保证了一个线程穿件实例成功后，其他线程无法创建新的实例
				if(instance == null){
					instance = new SingleObject();
				}
			}
		}
		return instance;
	}*/
	
	public void showMessage(){
		System.out.println("单例对象功能函数");
	}
}
