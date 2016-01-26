package com.constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();
		
		// running this you would normally expect to get the date twice.
		// this first time we get null as the date has not been initialized as it is being
		// called by the super class constructor, which will always run before the subclass
		// constructor... it in turn calls the overwritten ovverideMd method which references 
		// the date.
		
		// In this case we get null due to specific null handling by the println() method
		// in other cases we would expect a NullPointerException
	}
}
