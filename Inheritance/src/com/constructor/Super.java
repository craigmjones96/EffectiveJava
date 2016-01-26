package com.constructor;

public class Super {

	// Should not call an overridable method in a constructor.
	// The constructor should rely on this method for initialization and 
	// allowing it to be overwritten could mean that the classes initialization if changed
	public Super() {
		overrideMe();
	}
	
	public void overrideMe() {
		System.out.println("Super method");
	}
}
