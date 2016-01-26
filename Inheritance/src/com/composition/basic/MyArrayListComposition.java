package com.composition.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// basic example of composition where store a component
// of the object and overwrite certain methods

// when doing 'implements' you have to implement all the methods and manage them all
// better to do forwarding and use a wrapper
public class MyArrayListComposition<E> implements List<E>{

	private ArrayList<E> arrayList;

	private int addCount=0;
	
	public MyArrayListComposition(ArrayList<E> list) {
		this.arrayList = list;
	}
	
	// add extra functionality before forwarding the call
	// to the component
	@Override
	public void add(int index, E element) {
		addCount++;
		arrayList.add(element);
	}
	
	// add extra functionality before forwarding the call
	// to the component
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return arrayList.addAll(c);
	}

	@Override
	public int size() {
		return arrayList.size();
	}

	@Override
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return arrayList.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		return arrayList.iterator();
	}

	@Override
	public Object[] toArray() {
		return arrayList.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return arrayList.toArray(a);
	}

	@Override
	public boolean add(E e) {
		return arrayList.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return arrayList.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return arrayList.containsAll(c);
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return arrayList.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return arrayList.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return arrayList.retainAll(c);
	}

	@Override
	public void clear() {
		arrayList.clear();
	}

	@Override
	public E get(int index) {
		return arrayList.get(index);
	}

	@Override
	public E set(int index, E element) {
		return arrayList.set(index, element);
	}

	@Override
	public E remove(int index) {
		return arrayList.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return arrayList.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return arrayList.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return arrayList.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return arrayList.listIterator(index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return arrayList.subList(fromIndex, toIndex);
	}
}
