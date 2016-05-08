package com.nestedclasses;

public class Main {
	public static void main(String[] args) {
		// **** static member class ****
		
		// can instantiate the inner class directly
		NestedClasses.StaticClass staticClass = new NestedClasses.StaticClass();
		staticClass.sayHello();
		staticClass.printNumberOfBalloons();
		
		//=================================================================
		
		// **** non-static member class ****
		
		// cant do this
//		NestedClasses.NonStaticClass nonStaticClass = NestedClasses.NonStaticClass();
		
		// have to instantiate the outer class first before calling new on the inner class
		NestedClasses nested = new NestedClasses();
		NestedClasses.NonStaticClass nonStaticClass = nested.new NonStaticClass();
		nonStaticClass.sayHello();
		nonStaticClass.printNumberOfBalloons();
		
		//=================================================================
		
		// **** anonymous class ****
		
		// A normal class has anonymous classes created with the sayHello method
		// that only exists for the duration of that method.
		AnonymousAndLocalClasses anonymousClasses = new AnonymousAndLocalClasses();
		anonymousClasses.sayHello();
	}

}
