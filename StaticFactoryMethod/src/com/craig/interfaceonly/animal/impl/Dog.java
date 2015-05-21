package com.craig.interfaceonly.animal.impl;


public class Dog implements Animal {

	public static Animal newInstance() {
		return new Dog();
	}
	
	@Override
	public String type() {
		return "I am a dog";
	}

	@Override
	public String makeNoise() {
		return "Woof!";
	}

}
