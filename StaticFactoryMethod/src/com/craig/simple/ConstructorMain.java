package com.craig.simple;


public class ConstructorMain {

	public static void main(String[] args) {
		// Dog molly = new Dog("Molly");
		// Dog sasha = new Dog();
		// this wont work as we made a private consructor, which means there is no constructor 
		// (with or without parameters) available to us now.
		
		Dog bowser = Dog.newDog("Bowser");
		System.out.println(bowser.toString());
	}
}
