package com.inheritance;

import java.util.Collection;

public class MyArrayListImplementationExtension extends MyArrayListImplementation<String> {

	private int addCount = 0;
	
	// One problem here is that i'm only considering add and addAll for my new functionality
	// but there are also two other methods i have missed. One variation of add... add(int, Object)
	// and a variation of addAll... addAll(int, Collection).
	
	public MyArrayListImplementationExtension() {
		super();
	}

//  Will remove this generated constructor from superclass to make example easier
//	public ArrayListExtension(int initialCapacity) {
//		super(initialCapacity);
//	}

	// This method will work fine (for now, as long as the 
	// underlying implementation doesn't change).
	@Override
	public boolean add(String e) {
		addCount++;
		return super.add(e);
	}

	// This method wont work well as it will initially add to the count the number
	// of elements that are going to be added. Then what the developer doesn't seem
	// to know is that internally the super.addAll takes each element from the collection
	// and calls the add() implementation... in this case it has been overridden and 
	// actually increments the addCount as well as the addAll method. This means if the 
	// collection has 2 elements addCount will equal 2 in the addAll method, but then the 
	// add method will get called twice, adding 2 to the count as well, giving a total of 
	// 4 instead of 2.
	@Override
	public boolean addAll(Collection c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
}
