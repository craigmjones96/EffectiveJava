package com.cloneable;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// by simply adding the Cloneable interface to an object it allows the clone()
		// method to be called which creates a new object that is an exact copy of 
		// the object field-by-field
		Person a = new Person("Craig", "Jones");
		Person b = a.clone();
		
		// This shows the fields are identical
		System.out.println("Person A: " + a + ", name=" + a.getFirstName() + " " + a.getLastName());
		System.out.println("Person A clone: " + b + ", name=" + b.getFirstName() + " " + b.getLastName());
		
		// Using the default equals method shows they have different memory locations
		// and are therefore different objects
		System.out.println("A==B?:" + a.equals(b));
	}
}
