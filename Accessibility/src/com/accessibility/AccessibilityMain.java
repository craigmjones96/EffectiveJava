package com.accessibility;

import com.accessibility.package1.Package1;

public class AccessibilityMain {
	
	public static void main(String[] args) {
		Package1 package1 = new Package1();
		System.out.println("Package 1: " + package1.getName());
		package1.setName("Package1_newName");
		System.out.println("Package 1 new name: " + package1.getName());
		
		// the below code produces a compiler error as Package2 is package-private
		// and is in a different package to this class
//		Package2 package2 = new Package2():
	}
}
