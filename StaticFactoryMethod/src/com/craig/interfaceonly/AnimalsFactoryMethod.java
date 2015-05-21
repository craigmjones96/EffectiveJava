package com.craig.interfaceonly;


public class AnimalsFactoryMethod {

	private AnimalsFactoryMethod(){};
	
	public static Animal getDog() {
		return Dog.newInstance();
	};
	
	public static Animal getCat() {
		return Cat.newInstance();
	}
	
	private static class Dog implements Animal {

		protected Dog() {}
		
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
	
	private static class Cat implements Animal {

		protected Cat() {}
		
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
}
