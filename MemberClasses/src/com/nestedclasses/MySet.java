package com.nestedclasses;

import java.util.AbstractSet;
import java.util.Iterator;

public class MySet<E> extends AbstractSet<E> {

	// return the non-static member class below that 
	// implements the Iterator interface
	@Override
	public Iterator<E> iterator() {
		return new MyIterator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// This outer class implements its own Iterator in a non-static member class
	// which is return when the iterator() method is called on the outer class
	private class MyIterator implements Iterator<E> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
