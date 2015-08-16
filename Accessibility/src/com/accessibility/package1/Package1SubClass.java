package com.accessibility.package1;

public class Package1SubClass extends Package1 {
	
	@Override
	public String packageInformation() {
		return "Package1SubClass has a package of com.accessibility.package1";
	}
	
	// Can't do this as it is reducing the access level of the super class method
	// you receive a compiler error
//	@Override
//	String packageInformation() {
//		return packageInformation;
//	}
}
