package com.cloneable;

public class Person implements Cloneable {

	private final String firstName;
	private final String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	// The standard clone method would return an Object but and the client's calling the method
	// have to do the casting to Person. It is best to move that casting inside the clone method so
	// it only has to happen in one place.
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	@Override
	protected Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}
}
