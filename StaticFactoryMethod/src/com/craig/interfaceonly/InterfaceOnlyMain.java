package com.craig.interfaceonly;

import com.craig.interfaceonly.animal.impl.Animal;
import com.craig.interfaceonly.animal.impl.Dog;

public class InterfaceOnlyMain {

	public static void main(String[] args) {
		Animal cat = AnimalsFactoryMethod.getCat();
		System.out.println(cat.type());
		System.out.println(cat.makeNoise());
		
		Animal dog = AnimalsFactoryMethod.getDog();
		System.out.println(dog.type());
		System.out.println(dog.makeNoise());
		
		Dog dog2 = (Dog) AnimalsFactoryMethod.getDog();
		System.out.println(dog2.type());
		System.out.println(dog2.makeNoise());
	}
}
