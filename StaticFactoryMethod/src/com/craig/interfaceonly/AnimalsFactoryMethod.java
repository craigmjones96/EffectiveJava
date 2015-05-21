package com.craig.interfaceonly;

import com.craig.interfaceonly.animal.impl.Animal;
import com.craig.interfaceonly.animal.impl.Cat;
import com.craig.interfaceonly.animal.impl.Dog;

public class AnimalsFactoryMethod {

	private AnimalsFactoryMethod(){};
	
	public static Animal getDog() {
		return Dog.newInstance();
	};
	
	public static Animal getCat() {
		return Cat.newInstance();
	}
}
