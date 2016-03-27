package com.functionobjects;

// This is an example of a object ref acting as a function pointer.
// It has exactly one method and that method acts on two objects that are passed
// into the method, rather than acting on itself (the object the method is defined in).

//public class StringLengthCompartor {
//
//	public int compare(String s1, String s2) {
//		return s1.length() - s2.length();
//	}
//}

// The should be a singleton to save on unnecessary object creation costs as it is 
// is stateless and immutable and therefore all instances of the class are functionally equivalent

//public class StringLengthComparator {
//	
//	private StringLengthComparator() {}
//	
//	public static final StringLengthComparator INSTANCE = new StringLengthComparator();
//	
//	public int compart(String s1, String s2) {
//		return s1.length() - s2.length();
//	}
//}

// To make the class useful to developers and allow it to be easily passed
// to other methods its best to make its type more generic. Passing StringLengthComparator 
// as the type would not allow it to be passed to any other comparison methods easily so instead
// we define an interface type of Comparator which will allow developers to easily extend the type
// and create other comparator types of this strategy interface.

public class StringLengthComparator implements Comparator<String> {
	private StringLengthComparator() {}
	
	public static final StringLengthComparator INSTANCE = new StringLengthComparator();

	@Override
	public int compare(String t1, String t2) {
		return t1.length() - t2.length();
	}
}