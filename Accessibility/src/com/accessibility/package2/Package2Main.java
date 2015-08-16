package com.accessibility.package2;

public class Package2Main {

	public static void main(String[] args) {
		// this time we can access Package2 as it this class is in the same package
		Package2 package2 = new Package2();
		System.out.println("Package 2: " + package2.getName());
		package2.setName("Package2_newName");
		System.out.println("Package 1 new name: " + package2.getName());
	}
}
