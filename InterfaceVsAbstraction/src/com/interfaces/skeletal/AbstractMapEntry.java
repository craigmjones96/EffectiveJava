package com.interfaces.skeletal;

import java.util.Map;

public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

	// three methods below are the methods that must be implemented via the 
	// Map.Entry interface
	
	// Turn the first two into abstract methods to state any class extending this class
	// must always provide these two methods
	@Override
	public abstract K getKey();

	@Override
	public abstract V getValue();

	// As default throw UnsupportedOperationException to show that the default 
	// map is one that cannot be modified after creation
	
	// However, if a developer wishes to allow modifiable maps they can override this method
	// in a sub class
	@Override
	public V setValue(V value) {
		throw new UnsupportedOperationException();
	}

}
