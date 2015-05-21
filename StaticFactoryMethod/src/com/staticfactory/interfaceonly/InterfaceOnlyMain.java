package com.staticfactory.interfaceonly;

public class InterfaceOnlyMain {

	public static void main(String[] args) {
		Animal cat = AnimalsFactoryMethod.getCat();
		System.out.println(cat.type());
		System.out.println(cat.makeNoise());
		
		Animal dog = AnimalsFactoryMethod.getDog();
		System.out.println(dog.type());
		System.out.println(dog.makeNoise());
		
		// cant do this below as the implementation classes
		// are hidden so the API only offers up the interface
		// Dog dog2 = (Dog) AnimalsFactoryMethod.getDog();
		// System.out.println(dog2.type());
		// System.out.println(dog2.makeNoise());
	}
}
