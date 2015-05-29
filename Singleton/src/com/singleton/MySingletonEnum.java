package com.singleton;

public enum MySingletonEnum {
	INSTANCE;
	
	public void sayHello() {
		System.out.println("Hello!!!");
	}
}
