package com.singleton;

public class MySingletonStaticFactoryMethod {

	private static final MySingletonStaticFactoryMethod INSTANCE = new MySingletonStaticFactoryMethod();
	
	private MySingletonStaticFactoryMethod() {}
	
	public static MySingletonStaticFactoryMethod getInstance() {
		return INSTANCE;
	}
	
	public void sayHello() {
		System.out.println("Hello!!");
	}
}
