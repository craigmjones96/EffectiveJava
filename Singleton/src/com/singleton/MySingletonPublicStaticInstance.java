package com.singleton;

public class MySingletonPublicStaticInstance {

	public static final MySingletonPublicStaticInstance INSTANCE = new MySingletonPublicStaticInstance();
	
	private MySingletonPublicStaticInstance() {}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
}
