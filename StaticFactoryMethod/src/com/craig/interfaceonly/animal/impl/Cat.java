package com.craig.interfaceonly.animal.impl;


public class Cat implements Animal {

	public static Animal newInstance() {
		return new Cat();
	}
	
	@Override
	public String type() {
		return "I am a cat";
	}

	@Override
	public String makeNoise() {
		return "Meow!";
	}

}
