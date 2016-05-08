package com.nestedclasses;

public class NestedClasses {

	private static int staticNumberOfBalloons = 2;
	private int numberOfBalloons = 4;
	
	public static class StaticClass {
		public void sayHello() {
			System.out.println("Hello im a static member class");
		}
		
		public void printNumberOfBalloons() {
			System.out.println("There are " + staticNumberOfBalloons + " static balloons");
			
			// this wont work in a static member class as the numberOfBalloons is 
			// associated to an instance of the class. We can only get at the
			// static members (staticNumberOfBalloons)
//			System.out.println("There are " + numberOfBalloons + " balloons");
		}
	}
	
	public class NonStaticClass {
		public void sayHello() {
			System.out.println("Hello im a non-static member class");
		}

		public void printNumberOfBalloons() {
			// non-static class can access the static number of balloons as that is associated
			// with the class and it can also get to the nonStatic number of balloons as 
			// the non-static class is always linked to an instantiated outer class (you have
			// to create an outer class before you can create the inner non-static class) therefore
			// the value will be available.
			System.out.println("There are " + staticNumberOfBalloons + " static balloons");
			System.out.println("There are " + numberOfBalloons + " balloons");
		}
	}
}
