package com.generics;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// here we use an anonymous class to show how when we pass a type
		// parameter into the creation we are bound to using that type.
		// (the get method now returns the type String)
		MyGenericClass<String> stringClass = new MyGenericClass<String>() {
			
			@Override
			public String get(String id) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		// again using an anonymous class, here we see that not passing a 
		// type parameter in means we are dealing with a generic type (in this
		// case Object)
		MyGenericClass genericClass = new MyGenericClass() {

			@Override
			public Object get(String id) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add(new String("Hello"));
		// this cannot be done as the compiler will throw a compilation error
		// because a type of Integer cannot be used on a definition of a class
		// with a supplied type parameter of String
		// stringList.add(new Integer(1));  
		
		// in the example below we havent provided a type parameter so we can technically
		// add any Object or subclass (String, Integer) and it has to accept it as it
		// technically is allowed. However, there are haeavy warnings from the compiler on
		// the code which suggest you should always provide a type to save from Runtime errors
		// of possibly trying to cast the objects when you get them out of the List
		ArrayList arrayList = new ArrayList();
		arrayList.add(new String(""));
		arrayList.add(new Integer(1));
		
		// The difference here and the one above is that in this case we 
		// are specifically telling the compiler that
		// we are happy to take any Object type and it relaxes the validation rules.
		ArrayList<Object> objectList = new ArrayList<Object>();
		objectList.add(new String("Hello"));
		objectList.add(new Integer(1));
		
		System.out.println("List<Object>");
		for(Object o: objectList) {
//			String s = (String) o; this will work perfectly on the first object but not the second (the integer)
			
			System.out.println(o);
		}
		
		// unbounded wildcard types can be used when you really dont care what objects you are holding
		// (mainly because you are doing some high level stuff). they are still a better choice than
		// using raw types just because they are safe
		Set<String> s1 = new HashSet<String>();
//		Set<?> s2 = new HashSet<?>(); you cant initialise with an unbounded wildcard as you cant put anything into it.
//		as the compiler simply doesnt know what it is to expect and what will be safe
		Set<?> s2 = new HashSet<Integer>();
		s1.add("Hello");
//		s2.add(10); event when you initialise s2 as a Set<Integer> as you use the unbounded wildcard
//		it still wont let you put anything in.
		Set<Integer> s3 = new HashSet<Integer>();
		s3.add(10);
		numberOfElementsInCommon(s1, s3); // can then pass them into a method which has unbounded wildcard
		// definitions as we are doing high level stuff to them.
		
		// you can also use unbounded wildcards to say 'any subtype of E'
		// see unboundSubType method below these are called bounded wildcard types
		// (as it is bounded to a subtype of E)
	}
	
	static int unboundSubType(Set<? extends Integer> s1) {
		return 1;
	}
	
	static int numberOfElementsInCommon(Set<?> s1, Set<?> s2) {
		int result = 0;
		for(Object o: s1) {
			if(s2.contains(o)) result++;
		}
		return result;
	}
}
