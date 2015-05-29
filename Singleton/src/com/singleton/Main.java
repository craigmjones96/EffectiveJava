package com.singleton;

public class Main {

	public static void main(String[] args) {
		// MySingletonPublicStaticInstance singleton1 = new MySingletonPublicStaticInstance();
		// wont work as there is no public constructor
		
		MySingletonPublicStaticInstance singleton1 = MySingletonPublicStaticInstance.INSTANCE;
		singleton1.sayHello();
		
		//MySingletonStaticFactoryMethod singleton2 = new MySingletonStaticFactoryMethod();
		// wont work as there is no public constructor
		
		MySingletonStaticFactoryMethod singleton2 = MySingletonStaticFactoryMethod.getInstance();
		singleton2.sayHello();
		
		MySingletonEnum.INSTANCE.sayHello();
	}
}
