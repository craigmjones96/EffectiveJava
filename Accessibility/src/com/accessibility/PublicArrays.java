package com.accessibility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.accessibility.package1.Package1;

public class PublicArrays {

	// shouldnt do this as you can change the values within the array
	//public static final Package1[] PACKAGES = {new Package1()};
	
	// instead make it private
	private static final Package1[] PACKAGE1_ARRAY = {new Package1()};
	
	// and do a conversion to unmodifiable collection
	public static final List<Package1> PACKAGE1_VALUES = 
			Collections.unmodifiableList(Arrays.asList(PACKAGE1_ARRAY));
	
	// or return a clone in a accessor method
	public Package1[] getIntegers() {
		return PACKAGE1_ARRAY.clone();
	}
}
