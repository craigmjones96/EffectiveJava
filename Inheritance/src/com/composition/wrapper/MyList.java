package com.composition.wrapper;

import java.util.Collection;
import java.util.List;

// using forwarding allows for this class to only implement new logic in the methods it
// needs to (in this case we only care about the add methods).
public class MyList<E> extends ForwardingList<E> {

	private int addCount=0;
	
	public MyList(List<E> list) {
		super(list);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}
}
