package com.inheritance;

import java.util.Collection;

public class MyArrayListImplementation<E> {

	// Obviously this is a very crude implementation of a class handling array 
	// functionality but is only intended to fulfill the purpose of the example.
	
	private Object[] DATA = new Object[10];
	private int size = 0;
	
	public boolean add(E element) {
        DATA[size] = element;
        size++;
        return true;
    }
	
	public boolean addAll(Collection<? extends E> collection) {
        for(E element: collection) {
        	add(element);
        }
        return true;
    }
	
}
