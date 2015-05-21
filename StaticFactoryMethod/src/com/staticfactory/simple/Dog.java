package com.staticfactory.simple;

public class Dog {
	
	private String name;
	
	private Dog(String name){
		this.name = name;
	};
	
	public static Dog newDog(String name) {
		return new Dog(name);
	}
	
	public String toString() {
		return "This dog is called " + name;
	}
}
